package Assignment14.Level1;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        boolean isBefore = date1.isBefore(date2);
        boolean isAfter = date1.isAfter(date2);
        boolean isEqual = date1.isEqual(date2);

        System.out.println("First Date: " + date1);
        System.out.println("Second Date: " + date2);

        if (isBefore) {
            System.out.println("First date is before second date.");
        } else if (isAfter) {
            System.out.println("First date is after second date.");
        } else if (isEqual) {
            System.out.println("Both dates are the same.");
        }
    }
}

