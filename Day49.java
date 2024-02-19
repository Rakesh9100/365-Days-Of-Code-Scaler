// PriorityQueue

// https://www.interviewbit.com/problems/priorityqueue/

import java.lang.*;
import java.util.*;

public class Day49 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner scan = new Scanner(System.in);
        int query = scan.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < query; i++) {
            
            int x = scan.nextInt();
            int y = scan.nextInt();

            switch(x) {
                case 1 :
                    pq.add(y);
                    break;
                case 2 :
                    if(pq.peek() == null) System.out.println(-1);
                    else System.out.println(pq.peek());
                    break;
                case 3 : if(pq.peek() != null) pq.poll();
                    break;
            }
        }
        
    }
}
