package org.example.oop.converter.ext;

import org.example.oop.converter.TemperatureConverter;

public class Fahrenheit extends TemperatureConverter {
    public static final int ZERO_CELSIUS_IN_FAHRENHEIT = 32;
    private static final double CONST = 1.8;

    @Override
    public double toCelsius(double temp) {
        return (temp - ZERO_CELSIUS_IN_FAHRENHEIT) / CONST;
    }

    @Override
    public double toFahrenheit(double temp) {
        return temp * CONST + ZERO_CELSIUS_IN_FAHRENHEIT;
    }

    @Override
    public double toKelvin(double temp) {
        return (temp - ZERO_CELSIUS_IN_FAHRENHEIT) * 5 / 9 + Kelvin.ZERO_CELSIUS_IN_KELVIN;
    }
}
