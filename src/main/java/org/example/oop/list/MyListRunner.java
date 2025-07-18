package org.example.oop.list;

import org.example.oop.list.impl.MyArrayList;

public class MyListRunner {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.addLast("first");
        list.addLast("second");
        list.addLast("third");

        System.out.println(list);
        System.out.println("List size == " + list.size());

//        System.out.println("Element in position#1: " + list.get(20));

        System.out.println("Insert into middle");
        list.add(1, "fourth");
        System.out.println(list);
        list.add(4, "fifth");
        System.out.println(list);
        list.set(2, "sixth");
        System.out.println(list);
        list.addFirst("one");
        System.out.println(list);
        int index = 3;
        System.out.println("Remove index: " + index + ") " + list.remove(index));
        System.out.println(list);
    }
}
