package co.cesde.jose.models;

public class Student extends Person {

    private Long studentId;
    private String birthDate;

    public Student() {
        super();
    }

    public Student(Long userId, String code, String documentNumber, String firstName, String lastName, String email, Boolean status, long studentId, String birthDate) {
        super(userId, code, documentNumber, firstName, lastName, email, status);
        this.studentId = studentId;
        this.birthDate = birthDate;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student = ";

    }
}
