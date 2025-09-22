package Assignment14.Level2.AdditionalStatement;

import java.util.Scanner;

public class GcdLcmCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }
}

