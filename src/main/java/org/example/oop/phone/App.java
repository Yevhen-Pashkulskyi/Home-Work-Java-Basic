package org.example.oop.phone;

import org.example.oop.phone.imp.Androids;
import org.example.oop.phone.imp.IPhones;

public class App {
    public static void main(String[] args) {
        Androids androids = new Androids();
        System.out.println(androids.okGoogle());
        System.out.println(androids.call());
        System.out.println(androids.sms());
        System.out.println(androids.internet());
        IPhones iphones = new IPhones();
        System.out.println(iphones.siriAssistant());
        System.out.println(iphones.call());
        System.out.println(iphones.sms());
        System.out.println(iphones.internet());
    }
}
