// Pair and Tuple

// https://www.interviewbit.com/problems/pair-and-tuple/

/*
#include <iostream>
#include <vector>
#include<tuple>
using namespace std;
*/

pair<int, int> findMaxMin(vector<int> &A) {
    // First value of pair will be Maximum of array A and second will be Minimum of array A
    
    int Max = A[0];
    int Min = A[0];
    for(int i = 0; i < A.size(); i++) {
        if(Max < A[i]) {
            Max = A[i];
        }
        if(Min > A[i]) {
            Min = A[i];
        }
    }
    pair<int,int> ans(Max, Min);
    return ans;
    
}

tuple<int, int, int> compute(vector<int> &A){
    // First value of tuple will be sum of array A
    // Second value of tuple will be sum of even values in array A 
    // Third value of tuple will be sum of odd values in array A
    
    int sum1 = 0, sum2 = 0, sum3 = 0;
    for(int i = 0; i < A.size(); i++) {
        sum1 += A[i];
    }
    for(int i = 0; i < A.size(); i++) {
        if(A[i] % 2 ==  0) {
            sum2 += A[i];
        }
    }
    sum3 = sum1 - sum2;
   
    tuple<int,int,int> ans(sum1, sum2, sum3);
    return ans;
    
}

/*
int main()  {
    int n;
    cin>>n;
    vector<int> A(n);
    for(int i = 0; i < n; i++){
        cin>>A[i];
    }
    
    pair<int, int> max_min = findMaxMin(A);
    cout<<max_min.first<<" "<<max_min.second<<endl;
    
    tuple<int, int, int> tuple_values = compute(A);
    cout<< get<0>(tuple_values) << " " << get<1>(tuple_values) << " " << get<2>(tuple_values) << endl;
    
    return 0;
}
*/
