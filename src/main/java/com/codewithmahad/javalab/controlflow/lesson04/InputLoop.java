package com.codewithmahad.javalab.controlflow.lesson04;

import java.util.Scanner;

public class InputLoop {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            long total = 0;
            int accepted = 0;

            while (true) {

                System.out.print(
                        "Enter quantity (0 to stop): ");

                if (!scanner.hasNextLine()) {
                    System.out.println("Input ended.");
                    break;
                }

                String input = scanner.nextLine().trim();

                int quantity;

                try {
                    quantity = Integer.parseInt(input);
                } catch (NumberFormatException exception) {
                    System.out.println("Invalid integer.");
                    continue;
                }

                if (quantity == 0) {
                    break;
                }

                if (quantity < 0) {
                    System.out.println(
                            "Negative quantity rejected.");
                    continue;
                }

                total += quantity;
                accepted++;
            }

            System.out.printf(
                    "Accepted: %d, Total: %d%n",
                    accepted, total);
        }
    }
}
