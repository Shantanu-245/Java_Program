package Assignment14.Level2.AdditionalStatement;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;
        switch (op) {
            case '+': result = add(a, b); 
            break;
            case '-': result = subtract(a, b); 
            break;
            case '*': result = multiply(a, b); 
            break;
            case '/': result = divide(a, b); 
            break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
    }

    public static double add(double x, double y) { return x + y; }
    public static double subtract(double x, double y) { return x - y; }
    public static double multiply(double x, double y) { return x * y; }
    public static double divide(double x, double y) { return y != 0 ? x / y : 0; }
}
