package co.cesde.jose.repository.impl;

import co.cesde.jose.models.Student;
import co.cesde.jose.models.Teacher;
import co.cesde.jose.repository.TeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepositoryInMemory implements TeacherRepository {

    private List<Teacher> teachers;
    private Long nextTeacherId;

    public TeacherRepositoryInMemory() {

    }
    public TeacherRepositoryInMemory(List<Teacher> teachers) {
        this.teachers = teachers;
        this.nextTeacherId = null;
    }

    @Override
    public Teacher create(Teacher teacher) {
        if (teachers == null) {
            return null;
        }
        if (existsByDocumentNumber(teacher.getDocumentNumber())) {
            return null;
        }
        teacher.setTeacherId(nextTeacherId++);
        teachers.add(teacher);
        return teacher;
    }



    @Override
    public boolean delete(Long teacherId) {
        Teacher teacher = findById(teacherId);
        if (teacher == null) {
            return false;
        }
        return teachers.remove(teacher);
    }

    @Override
    public boolean update(Long teacherUpdate) {
        return false;
    }

    @Override
    public Teacher findById(Long teacherId) {
        if (teacherId == null) {
            return null;
        }

        for (Teacher teacher : teachers) {
            if (teacherId.equals(teacher.getTeacherId())) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public Teacher findByDocumentNumber(String documentNumber) {
        if (documentNumber == null) {
            return null;
        }

        for (Teacher teacher : teachers) {
            if (teacher.getDocumentNumber().equals(documentNumber)) {
                return teacher;
            }

        }
        return null;
    }


    @Override
    public List<Teacher> findAll() {
        return new ArrayList<>(teachers);
    }

    @Override
    public boolean existsByDocumentNumber(String documentNumber) {
        return false;
    }

    @Override
    public boolean existsById(Long teacherId) {
        return false;
    }

}