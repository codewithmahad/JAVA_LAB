package com.codewithmahad.javalab.controlflow.lesson03;

public class DecisionMaking {

    public static void main(String[] args) {

        int marks = 82;
        int attendance = 74;
        boolean feeCleared = true;

        // Grade Classification
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Attendence eligibility
        if (attendance < 0 || attendance > 100) {
            System.out.println("Invalid Attendene");
            return;
        }

        if (!feeCleared) {
            System.out.println("Denied: Fees not cleared");
        } else if (attendance < 75) {
            System.out.println("Denied: Low attendance");
        } else if (marks < 50) {
            System.out.println("Denied: Insufficient marks");
        } else {
            System.out.println("Eligible for exam");
        }

    }
}
