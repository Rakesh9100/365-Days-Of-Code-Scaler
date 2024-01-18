// Strings

// https://www.interviewbit.com/problems/strings/

/*
#include<iostream>
#include<string>
using namespace std;
*/

int main()  {
    string A, B;
    cin>>A>>B;
    // YOUR CODE GOES HERE
    
    string s = A + B;
    char ch = A[0];
    A[0] = B[0];
    B[0] = ch;
    cout << A.length() << " " << B.length() << "\n";
    cout << s << "\n";
    cout << A << " " << B;
    
    return 0;
}
