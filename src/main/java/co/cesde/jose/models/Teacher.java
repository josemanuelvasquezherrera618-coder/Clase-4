package co.cesde.jose.models;

public class Teacher extends Persons {

    private long teacherId;
    public Teacher() {
        super();
    }

    public Teacher(Long userId, String code, String documentNumber, String firstName, String lastName, String email, Boolean status) {
        super(userId, code, documentNumber, firstName, lastName, email, status);
    }

    @Override
    public String toString() {
        return "Teacher = " + "teacherId" + super.toString();
    }
}
