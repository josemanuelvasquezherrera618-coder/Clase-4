package co.cesde.jose.models;

public abstract class Persons {
    protected Long userId;
    protected String code;
    protected String documentNumber;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected Boolean status;

    protected Person() {
    }

    protected Person(Long userId, String code, String documentNumber, String firstName, String lastName, String email, Boolean status) {
        this.userId = userId;
        this.code = code;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.status = status;
    }

    @Override
    public abstract String getRole();
    return "";

    public Long getUserId() {
        return userId;
    }

    public String getCode() {
        return code;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userId=" + userId +
                ", code='" + code + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }
}

