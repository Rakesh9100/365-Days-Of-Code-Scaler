// Set and Multiset

// https://www.interviewbit.com/problems/set-and-multiset/

#include<iostream>
#include<set>
#include<iterator>
using namespace std;

int main()  {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // E.g. 'cin' for input & 'cout' for output
    
    set<int> s;

    int Q;
    cin >> Q;

    for (int i = 0; i < Q; ++i) {
        int y, x;
        cin >> y >> x;

        switch (y) {
            case 1:
                s.insert(x);
                break;
            case 2:
                s.erase(x);
                break;
            case 3:
                if (s.find(x) != s.end()) {
                    cout << "Yes" << endl;
                } else {
                    cout << "No" << endl;
                }
                break;
            default:
                break;
        }
    }

    if (s.size() > 0) {
        for (auto itr = s.begin(); itr != s.end(); ++itr) {
            cout << *itr << endl;
        }
    }
    
    return 0;
}
