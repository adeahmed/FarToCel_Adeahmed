package org.example;

public class App {

    public static void main(String[] args) {
        double fahrenheit = 32.0;

        ConverterAhmed converter = new ConverterAhmed(fahrenheit);
        double celsius = converter.toCelsius();

        System.out.println(celsius);
    }

}
