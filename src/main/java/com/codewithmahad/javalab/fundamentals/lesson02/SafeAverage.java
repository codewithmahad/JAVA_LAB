
package com.codewithmahad.javalab.fundamentals.lesson02;

public class SafeAverage {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        double wrong = (a + b) / 2.0;

        double correct = ((long) a + b) / 2.0;

        System.out.println("Wrong: " + wrong);
        System.out.println("Correct: " + correct);
    }
}
      