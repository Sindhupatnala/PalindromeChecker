// UC5: Stack-Based Palindrome Checker
// File Name: UC5PalindromeChecker.java

import java.util.Stack;

public class UC5PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER - UC5    ");
        System.out.println("=================================");

        String input = "madam";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < input.length(); i++) {
            char poppedChar = stack.pop();

            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}