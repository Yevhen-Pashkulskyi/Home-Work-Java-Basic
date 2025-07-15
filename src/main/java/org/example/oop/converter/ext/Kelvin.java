package org.example.oop.converter.ext;

import org.example.oop.converter.TemperatureConverter;

public class Kelvin extends TemperatureConverter {
    public static final double ZERO_CELSIUS_IN_KELVIN = 273.15;

    @Override
    public double toCelsius(double temp) {
        return temp - ZERO_CELSIUS_IN_KELVIN;
    }

    @Override
    public double toFahrenheit(double temp) {
        return (temp - ZERO_CELSIUS_IN_KELVIN) * 1.8 + Fahrenheit.ZERO_CELSIUS_IN_FAHRENHEIT;
    }

    @Override
    public double toKelvin(double temp) {
        return temp + ZERO_CELSIUS_IN_KELVIN;
    }
}
