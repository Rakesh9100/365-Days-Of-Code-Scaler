// Buffered Reader

// https://www.interviewbit.com/problems/buffered-reader/

import java.lang.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Day37 {
    public static void main(String[] args) throws IOException {
        
        //your code goes here
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(a + " " + b);
        
    }
}
