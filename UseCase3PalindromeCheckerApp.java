// UC13: Performance Comparison of Palindrome Algorithms
// File Name: UseCase13PalindromeCheckerApp.java

import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase13PalindromeCheckerApp {

    // Algorithm 1: Two-Pointer (String)
    public static boolean twoPointerCheck(String input) {
        int start = 0, end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Algorithm 2: Stack-based
    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Algorithm 3: Deque-based
    public static boolean dequeCheck(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   PALINDROME CHECKER - UC13     ");
        System.out.println("=================================");

        String input = "A man a plan a canal Panama"
                .replaceAll("\\s+", "")
                .toLowerCase();

        long startTime, endTime;

        // Two Pointer Timing
        startTime = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        endTime = System.nanoTime();
        long timeTwoPointer = endTime - startTime;

        // Stack Timing
        startTime = System.nanoTime();
        boolean result2 = stackCheck(input);
        endTime = System.nanoTime();
        long timeStack = endTime - startTime;

        // Deque Timing
        startTime = System.nanoTime();
        boolean result3 = dequeCheck(input);
        endTime = System.nanoTime();
        long timeDeque = endTime - startTime;

        // Display Results
        System.out.println("Palindrome Result (Two Pointer): " + result1);
        System.out.println("Palindrome Result (Stack): " + result2);
        System.out.println("Palindrome Result (Deque): " + result3);

        System.out.println("\nExecution Time (in nanoseconds):");
        System.out.println("Two Pointer Approach : " + timeTwoPointer);
        System.out.println("Stack-Based Approach : " + timeStack);
        System.out.println("Deque-Based Approach : " + timeDeque);

        System.out.println("Program executed successfully.");
    }
}