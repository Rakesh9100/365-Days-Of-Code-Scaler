// Jump Statements

// https://www.interviewbit.com/problems/jump-statements/

#include<iostream>

using namespace std;

int main()  {
    int N;
    cin>>N;
    // YOUR CODE GOES HERE
    
    for (int i = 0; i < N; ++i) {
        if (i % 2 == 0) {
            continue;
        }
        cout << i << endl;
    }
    
    return 0;
}
