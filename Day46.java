// Stacks

// https://www.interviewbit.com/problems/stacks/

import java.lang.*;
import java.util.*;

public class Day46 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            String A = scanner.next(); // Input string for each test case
            if (isBalanced(A)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
    
    private static boolean isBalanced(String A) {
        Stack<Character> stack = new Stack<>();

        for (char c : A.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop(); // Matching pair found, pop from the stack
                }
            }
        }

        return stack.isEmpty();
    
    }
}
