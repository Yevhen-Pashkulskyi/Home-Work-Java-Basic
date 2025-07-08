package org.example.oop.drink_machine;
import static org.example.oop.drink_machine.Drinks.*;

enum DrinkMachine {
    COFFEE("Coffee",COFFEE_PRICE),
    TEA("Tea",1.5),
    LIMONADE("Limonade",5.4),
    MOJITO("Mojito",6.1),
    MINERAL_WATER("Mineral-water",1.5),
    COCA_COLA("Coca-cola",3.6);

    private String name;
    private double price;

    DrinkMachine(String name,double price) {
        this.name = name;
        this.price = price;
    }
}

/*
1) enum (напої)

2) константи (ціни)

3) static (загальна вартість)

4) switch (вибір напою)

Завдання:

#1 зробіть enum DrinksMachine, який вміє робити КАВУ, ЧАЙ, ЛИМОНАД, МОХІТО, МИНЕРАЛКУ, КОКА_КОЛУ;

#2 Зробіть клас Drinks, де константами задайте ціну напою;

#3 Зробіть підрахунок кількості виготовлених напоїв та загальної суми, яку повинен заплатити клієнт;

#4 Зробіть спосіб приготування кожного напою;

#5 Зробіть switch-case оператор, який буде робити напій (викликаючи відповідний метод) в залежності від вибору клієнта;

#6 Додайте можливість вибору напою для користувача і залежно від вибору робіть йому напій;

#7 Користувач повинен мати можливість замовити кілька напоїв

#8 І насамкінець клієнт має побачити, скільки грошей він повинен заплатити;
*/
