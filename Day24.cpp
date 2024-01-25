// Polymorphism

// https://www.interviewbit.com/problems/polymorphism/

/*
#include<iostream>
using namespace std;
*/

// YOUR CODE GOES HERE

int compute(int x, int y) {
    int A = x - y;
    if (A < 0) {
        A = A * (-1);
    }
    return A;
}

int compute(int z) {
    return z * z;
}

/*
int main()  {
    int x,y;
    cin>>x>>y;
    cout<<compute(x,y)<<endl;
    int z;
    cin>>z;
    cout<<compute(z)<<endl;
    return 0;
}
*/
