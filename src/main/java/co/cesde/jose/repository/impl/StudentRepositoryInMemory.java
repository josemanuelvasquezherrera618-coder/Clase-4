package co.cesde.jose.repository.impl;

import co.cesde.jose.models.Student;
import co.cesde.jose.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemory implements StudentRepository {

    private List<Student> students;
    private Long nextStudentId;

    public StudentRepositoryInMemory() {

    }
    public StudentRepositoryInMemory(List<Student> students) {
        this.students = students;
        this.nextStudentId = null;
    }

    @Override
    public Student create(Student student) {
        if (students == null) {
            return null;
        }
        if (existByDocumentNumber(student.getDocumentNumber())) {
            return null;
        }
        student.setStudentId(nextStudentId++);
        students.add(student);
        return student;
    }

    @Override
    public boolean delete(Long studentId) {
        Student student = findById(studentId);
        if (student == null) {
            return false;
        }
        return students.remove(student);
    }

    @Override
    public boolean update(Long studentUpdate) {

        return false;
    }

    @Override
    public Student findById(Long studentId) {
        if (studentId == null) {
            return null;
        }

        for (Student student : students) {
            if (studentId.equals(student.getStudentId())) {
                return student;
            }
        }
        return null;
    }

    @Override
    public boolean findByDocumentNumber(String documentNumber) {
        return students.stream()
                .anyMatch(student -> student.getDocumentNumber().equals(documentNumber));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public boolean existsById(Long studentId) {
        return false;
    }

    @Override
    public boolean existByDocumentNumber(String documentNumber) {
        return false;
    }
}