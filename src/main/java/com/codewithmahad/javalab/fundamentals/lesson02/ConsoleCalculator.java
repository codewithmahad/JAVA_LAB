
package com.codewithmahad.javalab.fundamentals.lesson02;

import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("First integer: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid integer.");
                return;
            }

            int a = scanner.nextInt();

            System.out.print("Second integer: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid integer.");
                return;
            }

            int b = scanner.nextInt();

            System.out.println("Sum: " + (a + b));
            System.out.println("Difference: " + (a - b));
            System.out.println("Product: " + (a * b));

            if (b != 0) {
                System.out.println("Integer division: " + (a / b));
                System.out.println("Decimal division: " + ((double) a / b));
                System.out.println("Remainder: " + (a % b));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        }
    }
}
