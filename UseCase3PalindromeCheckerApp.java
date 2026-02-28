// UC3: Palindrome Check Using String Reverse
// File Name: UseCase3PalindromeCheckerApp.java

public class UseCase3PalindromeCheckerApp {

    // Main Method - Entry Point
    public static void main(String[] args) {

        // Original String
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);  // String Concatenation
        }

        // Compare original and reversed string using equals()
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}