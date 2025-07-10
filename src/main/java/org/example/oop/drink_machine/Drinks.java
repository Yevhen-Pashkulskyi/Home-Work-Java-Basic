package org.example.oop.drink_machine;

import java.util.Scanner;

public class Drinks implements Runnable {
    private static final String EXIT = "EXIT";
    private final double COFFEE_PRICE = 4.5;
    private final double TEA_PRICE = 1.5;
    private final double LIMONADE_PRICE = 5.4;
    private final double MOJITO_PRICE = 6.1;
    private final double MINERAL_WATER_PRICE = 1.5;
    private final double COCA_COLA_PRICE = 3.6;
    private static double cost = 0;
    private static int count = 0;


    private void choiceDrink(DrinkMachine drinkMachine) {
        switch (drinkMachine) {
            case COFFEE:
                cost += COFFEE_PRICE;
                break;
            case TEA:
                cost += TEA_PRICE;
                break;
            case LIMONADE:
                cost += LIMONADE_PRICE;
                break;
            case MOJITO:
                cost += MOJITO_PRICE;
                break;
            case MINERAL_WATER:
                cost += MINERAL_WATER_PRICE;
                break;
            case COCA_COLA:
                cost += COCA_COLA_PRICE;
                break;
        }
        makeDrink(drinkMachine);
        count++;
    }

    private void makeDrink(DrinkMachine drinkMachine) {
        System.out.printf("Готовится: %s\n\n", drinkMachine.toString().toLowerCase());
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Меню:");
            for (DrinkMachine drinkMachine : DrinkMachine.values()) {
                System.out.println(drinkMachine);
            }
            System.out.println(EXIT);
            System.out.print("Выбрать напиток: ");
            String choice = sc.nextLine().toUpperCase();
            if (EXIT.equals(choice)) {
                break;
            }
            try{
                choiceDrink(DrinkMachine.valueOf(choice));
            }catch(IllegalArgumentException e){
                System.out.println("Такого напитка нет повторите выбор.");
            }
        }
        System.out.println("Количество напитков: " + count);
        System.out.println("Общая стоимость: " + cost + " $");
    }
}
/*
1) enum (напої) +
2) константи (ціни) +
3) static (загальна вартість) +
4) switch (вибір напою) +
Завдання:
#1 зробіть enum DrinksMachine, який вміє робити КАВУ, ЧАЙ, ЛИМОНАД, МОХІТО, МИНЕРАЛКУ, КОКА_КОЛУ; +
#2 Зробіть клас Drinks, де константами задайте ціну напою; +
#3 Зробіть підрахунок кількості виготовлених напоїв та загальної суми, яку повинен заплатити клієнт; +
#4 Зробіть спосіб приготування кожного напою; +
#5 Зробіть switch-case оператор, який буде робити напій (викликаючи відповідний метод) в залежності від вибору клієнта; +
#6 Додайте можливість вибору напою для користувача і залежно від вибору робіть йому напій; +
#7 Користувач повинен мати можливість замовити кілька напоїв +
#8 І насамкінець клієнт має побачити, скільки грошей він повинен заплатити; +
*/
