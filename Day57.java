// StringBuffer

// https://www.interviewbit.com/problems/stringbuffer/

import java.lang.*;
import java.util.*;

public class Day57 {
    public static void main(String[] args) {
        //Don't alter anything here.
        Scanner inp = new Scanner(System.in);
        String S = inp.nextLine();
        int L = inp.nextInt();
        inp.nextLine();
        int R = inp.nextInt();
        inp.nextLine();
        inp.close();
        
        System.out.println(solve(S,L,R));
        /**************************************/
    }
    
    //complete the function below
    
    public static String solve(String s, int L, int R)
    {
        String m = s.substring(L,R+1);
        StringBuffer str = new StringBuffer(m);
        str.reverse();
        String ans = s.substring(0, L) + str + s.substring(R + 1);
        return ans;
    }
}
