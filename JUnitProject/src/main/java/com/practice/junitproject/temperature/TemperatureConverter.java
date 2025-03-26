package com.practice.junitproject.temperature;

public class TemperatureConverter {

    /**
     * Converts Celsius to Fahrenheit using the formula:
     * Fahrenheit = (Celsius * 9/5) + 32
     * @param celsius Temperature in Celsius.
     * @return Converted temperature in Fahrenheit.
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Converts Fahrenheit to Celsius using the formula:
     * Celsius = (Fahrenheit - 32) * 5/9
     * @param fahrenheit Temperature in Fahrenheit.
     * @return Converted temperature in Celsius.
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
