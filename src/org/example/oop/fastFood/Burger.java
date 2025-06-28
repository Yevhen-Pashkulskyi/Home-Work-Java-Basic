package org.example.oop.fastFood;

public class Burger {
    private String bun;
    private String meatType;
    private String cheeseType;
    private String mayonnaiseType;

    public Burger(String bun, String meatType, String cheeseType, String mayonnaiseType) {
        this.bun = bun;
        this.meatType = meatType;
        this.cheeseType = cheeseType;
        this.mayonnaiseType = mayonnaiseType;
        System.out.printf("Burger standard: %s; %s; %s; %s.\n", bun, meatType, cheeseType, mayonnaiseType);
    }

    public Burger(String bun, String meatType, String cheeseType) {
        this.bun = bun;
        this.meatType = meatType;
        this.cheeseType = cheeseType;
        System.out.printf("Burger dietary: %s; %s; %s.\n", bun, meatType, cheeseType);
    }

    public Burger(String bun, int doubleMeat, String meatType, String cheeseType, String mayonnaiseType) {
        this.bun = bun;
        this.meatType = meatType;
        this.cheeseType = cheeseType;
        this.mayonnaiseType = mayonnaiseType;
        System.out.printf("Double burger: %s; %dx%s; %s; %s.", bun, doubleMeat, meatType, cheeseType, mayonnaiseType);
    }
}
