// ArrayList

// https://www.interviewbit.com/problems/arraylist/

import java.lang.*;
import java.util.*;

public class Day45 {
    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner(System.in);
        ArrayList<Integer> ar =  new ArrayList<>();
        int a = scanner.nextInt();
        while(a >= 0) {
            ar.add(a);
            a = scanner.nextInt();
        }

        for(int i = ar.size()-1; i >= 0; i--) {
            System.out.print(ar.get(i) + " ");
        }
        
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
    }
}
