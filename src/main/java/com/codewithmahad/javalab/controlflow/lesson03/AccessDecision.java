package com.codewithmahad.javalab.controlflow.lesson03;

public class AccessDecision {
    public static void main(String[] args) {

        boolean authenticated = true;
        boolean accountActive = true;
        boolean isOwner = false;
        boolean isAdmin = false;
        boolean documentArchived = true;

        if (!authenticated) {
            System.out.println("DENIED: Authentication required");
            return;
        }
        if (!accountActive) {
            System.out.println("DENIED: Account inactive");
            return;
        }
        if (documentArchived && !isAdmin) {
            System.out.println("DENIED: Archived document");
            return;
        }
        if (isOwner || isAdmin) {
            System.out.println("ALLOWED");
        } else {
            System.out.println("DENIED: Insufficient permissions");
        }
    }
}
