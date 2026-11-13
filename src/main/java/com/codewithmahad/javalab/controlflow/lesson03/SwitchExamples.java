package com.codewithmahad.javalab.controlflow.lesson03;

public class SwitchExamples {
    public static void main(String[] args) {

        String orderStatus = "PAID";

        // modern switch

        String action = switch (orderStatus) {
            case "PENDING" -> "Request Payment";
            case "PAID" -> "Prepare shipment";
            case "SHIPPED" -> "Track delivery";
            case "DELIVERED" -> "Order completed";
            case "CANCELLED" -> "No further action";
            default -> "Unknown order status";
        };

        System.out.println("Action: " + action);

        int priority = 2;
        switch (priority) {
            case 1 -> System.out.println("Critical priority");
            case 2, 3 -> System.out.println("Normal priority");
            default -> System.out.println("Low priority");
        }

        // Ternary Operator
        int stock = 0;

        String availability = stock > 0 ? "IN_STOCK" : "OUT_OF_STOCK ";
        System.out.println("Stock: " + availability);

        String role = new String("ADMIN");
        if ("ADMIN".equals(role)) {
            System.out.println("Administrator role detected");
        }
    }
}
