package Assignment14.Level2.ProblemStatement;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        String feedback;
        int guess;

        while (low <= high) {
            guess = (low + high) / 2;
            feedback = sc.nextLine();
            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Great! I guessed your number: " + guess);
                break;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else {
                System.out.println("Invalid input. Please enter high, low, or correct.");
            }
        }
    }
}

