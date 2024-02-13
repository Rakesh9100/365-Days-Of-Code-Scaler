// 1D Array

// https://www.interviewbit.com/problems/1d-array/

import java.lang.*;
import java.util.*;

public class Day43 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for(int i = n-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        
    }
}
