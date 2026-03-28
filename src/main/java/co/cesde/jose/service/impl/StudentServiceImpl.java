package co.cesde.jose.service.impl;

import co.cesde.jose.models.Student;
import co.cesde.jose.repository.StudentRepository;
import co.cesde.jose.service.StudentService;

import java.util.List;

public abstract class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student create(Student student) {
        if (isInvalidStudent(student) || studentRepository.existByDocumentNumber(student.getDocumentNumber())){
            return null;
        }
        return studentRepository.create(student);
    }

    @Override
    public boolean update(Long studentUpdate) {
        return studentRepository.update(studentUpdate);
    }

    @Override
    public boolean delete(Long studentId) {
        return false;
    }


    private boolean isInvalidStudent(Student student){

        return false;
    }

    @Override
    public Student findById(Long studentId) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }


    private boolean IsValidDStudent(Student student) {
        return student == null
                || !isNotBlank(student.getCode())
                || !isNotBlank(student.getDocumentNumber())
                || !isNotBlank(student.getFirstName())
                || !isNotBlank(student.getLastName())
                || student.getStatus() == null
                || !isNotBlank(student.getBirthDate());
    }

    private boolean isNotBlank(String value) {
        return value != null && !value.isBlank();
    }
}
