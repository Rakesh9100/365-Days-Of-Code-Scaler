// PriorityQueue Comparator

// https://www.interviewbit.com/problems/priorityqueue-comparator/

import java.lang.*;
import java.util.*;

public class Day50 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.nextLine();
        PriorityQueue < Integer > pq = new PriorityQueue < Integer> (10000,new CustomComparator());
        for (int i = 0; i < n; i++) {
            int a = inp.nextInt();
            int b = inp.nextInt();
            inp.nextLine();
            if (a == 1)
                pq.offer(b);
            else if (a == 2) {
                if (pq.size() == 0) System.out.println("-1");
                else System.out.println(pq.peek());
            } else {
                if (pq.size() == 0) continue;
                else pq.poll();
            }
        }

    }
}
class CustomComparator implements Comparator < Integer > {

    @Override
    public int compare(Integer number1, Integer number2) {
        int value = number1.compareTo(number2);
        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        } else if (value < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
