package Lambda_Expressions;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList(
            "Critical: Heart rate high",
            "Normal: Routine checkup",
            "Urgent: Blood pressure drop"
        );

        Predicate<String> criticalOnly = msg -> msg.contains("Critical");

        System.out.println("Filtered Alerts:");
        alerts.stream()
              .filter(criticalOnly)
              .forEach(System.out::println);
    }
}

