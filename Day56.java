// Substring

// https://www.interviewbit.com/problems/substring/

import java.lang.*;
import java.util.*;

public class Day56 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner sc= new Scanner(System.in);
        String A = sc.next();
        int L = sc.nextInt();
        int R = sc.nextInt();
        System.out.println(A.substring(L, R + 1));
        
    }
}
