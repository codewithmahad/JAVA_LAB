
package com.codewithmahad.javalab.fundamentals.lesson02;

public class VariablesAndOperators {

    public static void main(String[] args) {

        // 1. Variables and constants
        int completedTasks = 7;
        int totalTasks = 10;
        final int PASS_MARK = 8;

        // 2. Arithmetic
        int remainingTasks = totalTasks - completedTasks;
        double completionPercentage = (completedTasks * 100.0) / totalTasks;

        System.out.println("Remaining: " + remainingTasks);
        System.out.println("Completed: " + completionPercentage + "%");

        // 3. Comparison and logical operators
        boolean passed = completedTasks >= PASS_MARK;
        boolean canRetry = !passed && remainingTasks > 0;

        System.out.println("Passed: " + passed);
        System.out.println("Can retry: " + canRetry);

        // 4. Integer arithmetic
        System.out.println("10 / 4 = " + (10 / 4));
        System.out.println("10 % 4 = " + (10 % 4));

        // 5. Increment behavior
        int counter = 5;
        int oldValue = counter++;
        int newValue = ++counter;

        System.out.println("Old value: " + oldValue);
        System.out.println("New value: " + newValue);
        System.out.println("Counter: " + counter);

        // 6. Short-circuit evaluation
        int divisor = 0;
        boolean safe = divisor != 0 && 10 / divisor > 1;

        System.out.println("Safe condition: " + safe);
    }
}
