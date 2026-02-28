package co.cesde.jose.models;

public class Student extends Person {

    private String birthDate;

    public Student() {
        super();
    }

    public Student(Long userId, String code, String documentNumber, String firstName, String lastName, String email, Boolean status, String birthDate) {
        super(userId, code, documentNumber, firstName, lastName, email, status);
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
