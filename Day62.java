// Pattern Syntax Checker

// https://www.interviewbit.com/problems/pattern-syntax-checker/

import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.regex.*;

public class Day62 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while(testCases > 0) {
			String pattern = in.nextLine();
			//Write your code
			
			try {
                // Attempt to compile the pattern
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

            testCases--;
			
		}
        
    }
}
