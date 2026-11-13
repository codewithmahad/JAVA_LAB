package com.codewithmahad.javalab.controlflow.lesson03;

public class ShippingCalculator {
    public static void main(String[] args) {

        int quantity = 3;
        long unitPriceRupees = 1999;
        boolean premiumMember = false;
        boolean internationalShipping = false;

        // Reject a quantity of zero or less and a negative unit price.
        if (quantity <= 0 || unitPriceRupees < 0) {
            System.out.println("Invalid Quantity");
        }
        // Calculate the subtotal using integer minor units (paisa).
        long subTotal = unitPriceRupees * quantity;
        long shipping;

        if (internationalShipping) {
            shipping = 2500;
        } else if (premiumMember || subTotal >= 5000) {
            shipping = 0;
        } else {
            shipping = 499;
        }

        long total = subTotal + shipping;

        System.out.println("Subtotal: " + subTotal);
        System.out.println("Shipping: " + shipping);
        System.out.println("Total: " + total);
    }
}
