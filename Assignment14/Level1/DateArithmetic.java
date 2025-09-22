package Assignment14.Level1;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        LocalDate inputDate = LocalDate.parse(input);

        LocalDate after7Days = inputDate.plusDays(7);
        LocalDate after1Month = after7Days.plusMonths(1);
        LocalDate after2Years = after1Month.plusYears(2);
        LocalDate finalDate = after2Years.minusWeeks(3);

        System.out.println("Original Date: " + inputDate);
        System.out.println("After 7 Days: " + after7Days);
        System.out.println("After 1 Month: " + after1Month);
        System.out.println("After 2 Years: " + after2Years);
        System.out.println("After Subtracting 3 Weeks: " + finalDate);
    }
}

