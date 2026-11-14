package com.codewithmahad.javalab.controlflow.lesson04;

public class LoopMechanics {
    public static void main(String[] args) {

        int[] scores = { 70, 80, 90 };
        int sum = 0;

        // 1. Indexed traversal
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        System.out.println("Sum: " + sum);

        // 2. Enhanced for-loop
        for (int score : scores) {
            score = 0; // Changes local copy only
        }

        System.out.println("First score: " + scores[0]);

        // 3. while loop
        int countdown = 3;

        while (countdown > 0) {
            System.out.print(countdown-- + " ");
        }

        System.out.println();

        // 4. do-while loop
        int attempts = 0;

        do {
            attempts++;
        } while (attempts < 1);

        System.out.println("Attempts: " + attempts);

        // 5. continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println();

        // 6. Labelled break
        outer: for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                if (row == 1 && col == 1) {
                    break outer;
                }

                System.out.print(
                        "(" + row + "," + col + ") ");
            }
        }

        System.out.println();   
    }
}
