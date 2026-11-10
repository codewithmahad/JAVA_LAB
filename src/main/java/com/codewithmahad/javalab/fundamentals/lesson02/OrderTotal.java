
package com.codewithmahad.javalab.fundamentals.lesson02;

public class OrderTotal {

    public static void main(String[] args) {
        int unitPrice = 1999;
        int quantity = 3;

        long subtotal = (long) unitPrice * quantity;
        long shipping = subtotal >= 5000 ? 0 : 499;
        long total = subtotal + shipping;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Shipping: " + shipping);
        System.out.println("Final total: " + total);
    }
}
