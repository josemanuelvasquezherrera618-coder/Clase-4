package co.cesde.jose.repository;

import co.cesde.jose.models.Student;

import java.util.List;

public interface StudentRepository {

    Student create(Student student);

    boolean delete(Long studentId);

    boolean update(Long studentUpdate);

    Student findById(Long studentId);

    boolean findByDocumentNumber(String documentNumber);

    List<Student> findAll();

    boolean existsById(Long studentId);
    boolean existByDocumentNumber(String documentNumber);
}
