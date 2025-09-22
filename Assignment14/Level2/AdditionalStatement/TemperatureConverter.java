package Assignment14.Level2.AdditionalStatement;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char choice = sc.next().toUpperCase().charAt(0);

        double result = (choice == 'C') ? toCelsius(temp) : toFahrenheit(temp);
        System.out.println("Converted temperature: " + result);
    }

    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}

