// Maps

// https://www.interviewbit.com/problems/maps-java/

import java.lang.*;
import java.util.*;

public class Day59 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner ob = new Scanner(System.in);
        int q = ob.nextInt();
        ob.nextLine();
        HashMap<String,Integer> hm = new HashMap<>();
        
        for(int i = 0; i < q; i++) {
            String str = ob.nextLine();
            int n = ob.nextInt();
            ob.nextLine();
            hm.put(str, n);
        }
        
        int n = ob.nextInt();
        ob.nextLine();
        for(int i = 0; i < n; i++) {
            String s = ob.nextLine();
            if(hm.containsKey(s)) {
                System.out.println(hm.get(s));
            }
            else {
                System.out.println("Not Found");
            }
        }

    }
}
