package com.codewithmahad.javalab.fundamentals.lesson01;

public class DataTypes {
    public static void main(String[] args) {
        byte exercises = 8;
        short studyMinutes = 120;
        int completedLessons; // Declaration without an initial value.
        completedLessons = 1; // Local variables must be assigned before use.
        long worldPopulation = 8_000_000_000L; // L marks a long literal.
        float temperatureCelsius = 24.5F; // F marks a float literal.
        double pi = 3.141592653589793;
        char grade = 'A';
        boolean isLearning = true;

        // String is a reference type, not a ninth primitive.
        String language = "Java";

        System.out.println("byte: " + exercises);
        System.out.println("short: " + studyMinutes);
        System.out.println("int: " + completedLessons);
        System.out.println("long: " + worldPopulation);
        System.out.printf("float: %.1f%n", temperatureCelsius);
        System.out.println("double: " + pi);
        System.out.println("char: " + grade);
        System.out.println("boolean: " + isLearning);
        System.out.println("String: " + language);

        int plannedLessons = 3;
        int totalLessons = completedLessons + plannedLessons;
        System.out.println("Completed + planned lessons: " + totalLessons);

        // Like C++, dividing two integers discards the fractional part.
        System.out.println("7 / 2 = " + (7 / 2));
        System.out.println("7.0 / 2 = " + (7.0 / 2));
    }
}
