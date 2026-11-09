package com.codewithmahad.javalab.fundamentals.lesson01;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");

        System.out.print("Learning ");
        System.out.print("Core Java");
        System.out.println(" one lesson at a time.");

        // printf uses placeholders; %n ends the line on the current platform.
        System.out.printf("Learner: %s | Lesson: %d%n", "Mahad", 1);

        // Escape sequences: quotes, a backslash, a tab, and a newline.
        System.out.println("Quoted text: \"Hello\"");
        System.out.println("Backslash: \\");
        System.out.println("Topic:\tFundamentals");
        System.out.println("First line\nSecond line");

        printStudyTip();
    }

    private static void printStudyTip() {
        System.out.println("Study tip: predict the output, then run the program.");
    }
}
