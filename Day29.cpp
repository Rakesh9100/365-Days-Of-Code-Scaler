// Custom Comparator

// https://www.interviewbit.com/problems/custom-comparator/

#include <vector>
#include <algorithm>

using namespace std;

bool comp(pair<int, int> a, pair<int, int> b) {
    // Compare on basis of the sum of the pairs
    return (a.first + a.second) < (b.first + b.second);
}

void sortArray(vector<pair<int, int>> &A) {
    sort(A.begin(), A.end(), comp);
}
