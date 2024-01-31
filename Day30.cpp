// Stack & Queue

// https://www.interviewbit.com/problems/stack-queue/

/*
#include<iostream>
#include<bits/stdc++.h>
using namespace std;
*/

// Complete the given function
vector<int> solve(vector<int> &A, int B){
    
    int n = A.size();
    vector<int> result;
    deque<int> dq;

    for (int i = 0; i < B; i++) {
        while (!dq.empty() && A[i] >= A[dq.back()]) {
            dq.pop_back();
        }
        dq.push_back(i);
    }

    for (int i = B; i < n; i++) {
        result.push_back(A[dq.front()]);

        while (!dq.empty() && dq.front() <= i - B) {
            dq.pop_front();
        }

        while (!dq.empty() && A[i] >= A[dq.back()]) {
            dq.pop_back();
        }

        dq.push_back(i);
    }

    result.push_back(A[dq.front()]);

    return result;
    
}


/*
int main()  {
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> A(n);
        for(int i = 0; i < n; i++){
            cin>>A[i];
        }
        int B;
        cin>>B;
        vector<int> ans = solve(A, B);
        for(int i = 0; i < ans.size(); i++){
            cout<<ans[i]<<" ";
        }
        cout<<endl;
    }
    return 0;
}
*/
