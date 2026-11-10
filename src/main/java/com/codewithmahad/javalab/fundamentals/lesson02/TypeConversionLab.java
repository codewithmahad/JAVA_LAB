
package com.codewithmahad.javalab.fundamentals.lesson02;

public class TypeConversionLab {

    public static void main(String[] args) {

        // 1. Widening
        int quantity = 100;
        long largeQuantity = quantity;
        double decimalQuantity = largeQuantity;

        System.out.println(decimalQuantity);

        // 2. Narrowing
        double price = 9.99;
        int truncatedPrice = (int) price;

        System.out.println("Truncated: " + truncatedPrice);

        // 3. Numeric promotion
        byte first = 100;
        byte second = 27;
        int sum = first + second;

        System.out.println("Byte sum: " + sum);

        // 4. Casting before vs after division
        int a = 5;
        int b = 2;

        double wrong = (double) (a / b);
        double correct = (double) a / b;

        System.out.println("Wrong: " + wrong);
        System.out.println("Correct: " + correct);

        // 5. Integer overflow
        int maximum = Integer.MAX_VALUE;
        int overflow = maximum + 1;

        System.out.println("Max int: " + maximum);
        System.out.println("Overflow: " + overflow);

        // 6. Floating-point precision
        double result = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + result);
    }
}
