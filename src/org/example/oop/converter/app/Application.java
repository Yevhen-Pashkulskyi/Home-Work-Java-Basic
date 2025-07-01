package org.example.oop.converter.app;

import org.example.oop.converter.ext.Fahrenheit;
import org.example.oop.converter.ext.Kelvin;

public class Application {
    public static void main(String[] args) {
        double celsius = 12;
        Fahrenheit fahrenheit = new Fahrenheit();
        Kelvin kelvin = new Kelvin();

        System.out.println("Celsius: " + celsius + " ℃");

        double fahrenheitWithCelsius = fahrenheit.toFahrenheit(celsius);
        System.out.println("Celsius to Fahrenheit: " + fahrenheitWithCelsius + " ℉");
        System.out.println("Fahrenheit to Celsius: " + fahrenheit.toCelsius(fahrenheitWithCelsius) + " ℃");
        System.out.println("Fahrenheit to Kelvin: " + fahrenheit.toKelvin(fahrenheitWithCelsius) + " K");

        double kelvinWithCelsius = kelvin.toKelvin(celsius);
        System.out.println("Celsius to Kelvin: " + kelvinWithCelsius + " K");
        System.out.println("Kelvin to Celsius: " + kelvin.toCelsius(kelvinWithCelsius) + " ℃");
        System.out.println("Kelvin to Fahrenheit: " + kelvin.toFahrenheit(kelvinWithCelsius) + " ℉");
    }
}
