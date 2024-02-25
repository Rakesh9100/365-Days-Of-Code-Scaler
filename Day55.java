// Introduction to Strings

// https://www.interviewbit.com/problems/introduction-to-strings/

import java.lang.*;
import java.util.*;

public class Day55 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int l = a.length() + b.length();
        System.out.println(l);
        int res = a.compareTo(b);
        
        if(res < 0) {
            System.out.println("No");
        }
        else if(res >= 1) {
            System.out.println("Yes");
        }
        String A = a.toUpperCase() + " " + b.toUpperCase();
        System.out.println(A);

    }
}
