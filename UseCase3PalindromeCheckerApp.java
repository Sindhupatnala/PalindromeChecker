// UC4: Character Array Based Palindrome Check
// File Name: UseCase4PalindromeCheckerApp.java

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   PALINDROME CHECKER - UC4      ");
        System.out.println("=================================");

        String input = "madam";

        // Convert string to character array
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Result
        if (isPalindrome) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}