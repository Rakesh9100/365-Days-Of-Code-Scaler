// Cpp Exception Handling

// https://www.interviewbit.com/problems/cpp-exception-handling/

/*
#include<iostream>
using namespace std;

int division(int a, int b) {
   if( b == 0 ) {
      throw "Division by zero condition!";
   }
   return (a/b);
}
*/

int main()  {
    try {
        int numerator, denominator;
        cin >> numerator >> denominator;

        if (denominator == 0) {
            throw runtime_error("Division by zero condition!");
        }

        int result = numerator / denominator;
        cout << result << endl;
    }
    catch (const exception& ex) {
        cout << ex.what() << endl;
    }
    
    // call function division(a, b)
    // print the result in try else exception in catch
    // Your code goes here
    return 0;
}
