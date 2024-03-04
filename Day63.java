// Currency Formatter

// https://www.interviewbit.com/problems/currency-formatter/

import java.lang.*;
import java.util.*;
import java.text.*;



public class Day63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        
        NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n1.format(payment);
        
        NumberFormat n2 = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india = n2.format(payment);
                
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        
    }
}
