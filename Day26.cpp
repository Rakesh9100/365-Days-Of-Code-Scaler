// Vector

// https://www.interviewbit.com/problems/vector/

#include<iostream>
#include <vector>
#include<algorithm>
using namespace std;

int main()  {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // E.g. 'cin' for input & 'cout' for output
    
    int N;
    cin >> N;

    // Read the integers into a vector
    vector<int> v(N);
    for (int i = 0; i < N; ++i) {
        cin >> v[i];
    }

    // Read the index to be deleted
    int X;
    cin >> X;

    // Erase the element at index X
    v.erase(v.begin() + X);

    // Sort the vector
    sort(v.begin(), v.end());

    // Print the remaining integers
    for (int i = 0; i < N - 1; ++i) {
        cout << v[i] << endl;
    }
    
    return 0;
}
