package co.cesde.jose.models;

public class Teacher extends Person {

    private Long teacherId;
    private String birthDate;

    public Teacher() {
        super(); }

    public Teacher(Long userId, String code, String documentNumber, String firstName, String lastName, String email, Boolean status) {
        super(userId, code, documentNumber, firstName, lastName, email, status);
        this.teacherId = teacherId;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public String getBirthDate() {

        return birthDate;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public void setBirthDate(String birthDate) {

        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Teacher = " + "teacherId" + super.toString();
    }
}
