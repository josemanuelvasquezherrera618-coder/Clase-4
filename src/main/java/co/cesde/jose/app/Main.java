package co.cesde.jose.app;

import co.cesde.jose.models.Persons;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persons person = new Persons();
        Persons person2 = new Persons();
        Persons person3 = new Persons();

        person.setFirstName("Jose");
        person.getFirstName();
        person2.setFirstName("Maria");
        person2.getFirstName();
        person3.setFirstName("Juan");
        person3.getFirstName();


        Persons person4 = new Persons(1L, "001", "123456789", "Jose", "Perez","vasquez@gmail.com", true);
        person.getFirstName();

        System.out.println(person.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());

        Persons person5 = new Persons();
        person5.setFirstName("Andres");
        System.out.println(person5.toString());

        Persons person6 = new Persons();
        person6.setFirstName("Carlos");
        System.out.println(person6.toString());

        Persons person7 = new Persons(2L, "002", "987654321", "Ana", "Gomez", "@gmail.com", true);
        System.out.println(person7.toString());

        Persons person8 = new Persons(3L, "003", "456789123", "Luisa", "Martinez", "@gmail.com", true);
        System.out.println(person8.toString());
    }

}
}
