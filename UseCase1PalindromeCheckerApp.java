// UC1: Application Entry & Welcome Message
// File Name: UseCase1PalindromeCheckerApp.java

public class UseCase1PalindromeCheckerApp {

    // Main Method - Entry Point of the Program
    public static void main(String[] args) {

        // Display Application Name
        System.out.println("=======================================");
        System.out.println("     PALINDROME CHECKER APPLICATION    ");
        System.out.println("=======================================");

        // Display Version
        System.out.println("Version: 1.0.0");

        // Welcome Message
        System.out.println("---------------------------------------");
        System.out.println("Welcome to the Palindrome Checker App!");
        System.out.println("This application checks whether a given");
        System.out.println("string is a palindrome or not.");
        System.out.println("---------------------------------------");

        // Program Flow Control
        System.out.println("Application started successfully.");
        System.out.println("Proceeding to next use case...");
    }
}
// UC2: Print a Hardcoded Palindrome Result
// File Name: UseCase2PalindromeCheckerApp.java

public class UseCase2PalindromeCheckerApp {

    // Main Method - Entry Point of the Program
    public static void main(String[] args) {

        // Hardcoded String Literal
        String word = "madam";

        // Reverse the String
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Conditional Statement to Check Palindrome
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Program Exit Message
        System.out.println("Program executed successfully.");
   // UC2: Palindrome Checker Logic

String input = "madam";
String reversed = new StringBuilder(input).reverse().toString();

if(input.equals(reversed)) {
    System.out.println("It is a palindrome");
} else {
    System.out.println("Not a palindrome");
}
    }
}