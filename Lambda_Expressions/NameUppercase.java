package Lambda_Expressions;

import java.util.*;

public class NameUppercase {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("sanjay", "kumar", "ravi");

        employees.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);
    }
}

