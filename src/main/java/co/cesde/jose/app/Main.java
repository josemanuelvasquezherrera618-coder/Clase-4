package co.cesde.jose.app;

import co.cesde.jose.models.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person.setFirstName("Jose");
        person.getFirstName();
        person2.setFirstName("Maria");
        person2.getFirstName();
        person3.setFirstName("Juan");
        person3.getFirstName();


        Person person4 = new Person(1L, "001", "123456789", "Jose", "Perez","vasquez@gmail.com", true);
        person.getFirstName();

        System .out.println(person.toString());


    }

}
