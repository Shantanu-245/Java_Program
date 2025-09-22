package Assignment14.Level1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        String formatted1 = today.format(format1);
        String formatted2 = today.format(format2);
        String formatted3 = today.format(format3);

        System.out.println("Date in dd/MM/yyyy: " + formatted1);
        System.out.println("Date in yyyy-MM-dd: " + formatted2);
        System.out.println("Date in EEE, MMM dd, yyyy: " + formatted3);
    }
}

