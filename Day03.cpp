// Variable and Types

// https://www.interviewbit.com/problems/variable-and-types/

#include<iostream>
#include <iomanip> 
using namespace std;

int main()  {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // E.g. 'cin' for input & 'cout' for output
    
    int a;
    long b;
    char c;
    float f;
    double d;
    
    cin >> a >> b >> c >> f >> d;
    
    cout << a << endl;
    cout << b << endl;
    cout << c << endl;
    cout << std::fixed << std::setprecision(3) << f << endl;
    cout << std::fixed << std::setprecision(9) << d << endl;
    
    return 0;
}
