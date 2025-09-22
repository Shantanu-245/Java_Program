package Assignment14.Level2.ProblemStatement;

import java.util.Scanner;

public class threeofMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        System.out.println("Maximum of the three numbers is: " + max);
    }
}

