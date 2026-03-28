package co.cesde.jose.service;

import co.cesde.jose.models.Student;

import java.util.List;

public interface StudentService {

    Student create(Student student);

    boolean delete(Long studentId);

    boolean update(Long studentUpdate);

    Student findById(Long studentId);

    boolean findByDocumentNumber(String documentNumber);

    List<Student> findAll();
}
