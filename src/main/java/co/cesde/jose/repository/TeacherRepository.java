package co.cesde.jose.repository;

import co.cesde.jose.models.Teacher;

import java.util.List;

public interface TeacherRepository {

    Teacher create(Teacher teacher);
    boolean delete(Long teacherId);boolean update(Long teacherUpdate);
    Teacher findById(Long teacherId);
    List<Teacher> findAll();
    boolean existsByDocumentNumber(String documentNumber);
    Teacher findByDocumentNumber(String documentNumber);
    boolean existsById(Long teacherId);

}