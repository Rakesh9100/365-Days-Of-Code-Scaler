// Upper & Lower bound

// https://www.interviewbit.com/problems/upper-lower-bound/

#include<iostream>
#include<vector>
#include<algorithm>
#include<iterator>
using namespace std;

int main()  {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // E.g. 'cin' for input & 'cout' for output
    
    int n;
    cin >> n;
    vector<int> v(n);
    
    for(int i = 0; i < n; i++) {
        cin >> v[i];
    }
    
    int q;
    cin >> q;
    vector<int>::iterator lower;
    
    for(int i = 0; i < q; i++) {
        int m;
        cin >> m;
        lower = lower_bound(v.begin(), v.end(), m);
        cout << lower - v.begin() << endl;
    }
        
    return 0;
}
