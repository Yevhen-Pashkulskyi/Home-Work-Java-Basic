package org.example.oop.fitnessTrekker;

public class AccountSportsmen {
    private static final int YEAR_TO_DAY = 2025;
    private final String name;
    private final int dayBirthday; // день рождения
    private final int monthBirthday; // месяц рождения
    private final int yearBirthday; // год рождения
    private final String email; // электронная почта
    private final String phoneNumber; //телефонный номер

    private int age;
    private String surname; //фамилия
    private double weight; // вес
    private int pressure; //давление
    private int steps; // пройденные шаги

    public AccountSportsmen(String name, int dayBirthday, int monthBirthday, int yearBirthday, String email,
                            String phoneNumber, String surname, double weight, int pressure, int steps) {
        this.name = name;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = YEAR_TO_DAY - yearBirthday;
    }

    public String getName() {
        return name;
    }

    public int getDayBirthday() {
        return dayBirthday;
    }

    public int getMonthBirthday() {
        return monthBirthday;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void printAccountInfo() {
        System.out.printf("\nName: %s\n", name);
        System.out.printf("Surname: %s\n", surname);
        System.out.printf("Day birthday: %d\n", dayBirthday);
        System.out.printf("Month birthday: %d\n", monthBirthday);
        System.out.printf("Year birthday: %d\n", yearBirthday);
        System.out.printf("Email: %s\n", email);
        System.out.printf("Phone number: %s\n", phoneNumber);
        System.out.printf("Weight: %.2f\n", weight);
        System.out.printf("Pressure: %d\n", pressure);
        System.out.printf("Steps: %d\n", steps);
        System.out.printf("Age: %d\n", age);
    }
}
