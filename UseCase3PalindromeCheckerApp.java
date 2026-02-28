// UC10: Case-Insensitive & Space-Ignored Palindrome Checker
// File Name: UseCase10PalindromeCheckerApp.java

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER - UC10   ");
        System.out.println("=================================");

        String input = "A man a plan a canal Panama";

        // Step 1: Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        // Step 2: Compare characters
        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
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