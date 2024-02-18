// Deque

// https://www.interviewbit.com/problems/deque/

import java.lang.*;
import java.util.*;

public class Day48 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < queries; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            switch(x) {
                case 1:
                    dq.addLast(y);
                    break;
                case 2:
                    dq.addFirst(y);
                    break;
                case 3:
                    if(dq.peek() == null) System.out.println(-1);
                    else System.out.println(dq.peekFirst());
                    break;
                case 4:
                    if(dq.peek() == null) System.out.println(-1);
                    else System.out.println(dq.peekLast());
                    break;
                case 5:
                    if(dq.peek() != null) dq.removeFirst();
                    break;
                case 6:
                    if(dq.peek() != null) dq.removeLast();
                    break;
            }
        }
        
    }
}
