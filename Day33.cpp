// Maps

// https://www.interviewbit.com/problems/maps-cpp/

#include<iostream>
#include<map>
using namespace std;

int main()  {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // E.g. 'cin' for input & 'cout' for output
    
    int Q;
    cin >> Q;

    map<int, int> boxes;

    while (Q--) {
        int type, X, Y;
        cin >> type >> X;

        if (type == 1) {
            cin >> Y;
            boxes[X] += Y;
        } else if (type == 2) {
            boxes[X] = 0;
        } else if (type == 3) {
            cout << boxes[X] << endl;
        }
    }
    
    return 0;
}
