package org.example.oop.person;

public class Person {
    private String name;
    private String surname;
    private String city;
    private String phone;

    public Person(String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
        System.out.println(reminder());
    }

    private String reminder() {
        return "Позвонить гражданину " + name + " " + surname + " с города " + city + " можно по номеру " + phone;
    }
}
