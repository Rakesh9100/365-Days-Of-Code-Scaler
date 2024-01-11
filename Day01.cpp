// Product of Digits

// https://www.interviewbit.com/problems/product-of-digits/

int Solution::solve(int A) {
    
    if(A == 0) {
        return 0 ;
    }
    int prod = 1 ;
    while (A) {
        int digit = A % 10 ;
        prod *= digit ;
        A /= 10 ;
    }
    return prod ;
    
}
