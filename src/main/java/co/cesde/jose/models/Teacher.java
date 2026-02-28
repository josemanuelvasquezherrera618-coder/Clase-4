package co.cesde.jose.models;

public class Teacher extends Person {

     public Teacher() {
         super();
     }

     public Teacher(Long userId, String code, String documentNumber, String firstName, String lastName, String email, Boolean status, String profession) {
          super(userId, code, documentNumber, firstName, lastName, email, status);
     }

     @Override
        public String toString() {
         return "Teacher = " + super.toString();
     }
}
