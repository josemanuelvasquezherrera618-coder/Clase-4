package co.cesde.jose.models;

public class Student extends Persons {

    private long studenId;
    protected String birthDate;

    public Student() {
        super();
        this.studenId = null;
        this.birthDate = null;
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

    @Override
    public String toString() {
        return "Student = " return "studentId" + super.toString() +
                "birthDate='" + birthDate + '\'';

    }
}
