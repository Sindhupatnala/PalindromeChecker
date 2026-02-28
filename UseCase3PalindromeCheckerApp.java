// UC9: Recursive Palindrome Checker
// File Name: UseCase9PalindromeCheckerApp.java

public class UseCase9PalindromeCheckerApp {

    // Recursive method
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don’t match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER - UC9    ");
        System.out.println("=================================");

        String input = "madam";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}