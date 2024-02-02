// Priority Queue

// https://www.interviewbit.com/problems/priority_queue/

int solve(vector<int> &A) {
    
    priority_queue<int, vector<int>, greater<int>> minHeap;

    for (int i = 0; i < A.size(); ++i) {
        minHeap.push(A[i]);
    }

    int totalCost = 0;

    while (minHeap.size() > 1) {
        int rope1 = minHeap.top();
        minHeap.pop();
        int rope2 = minHeap.top();
        minHeap.pop();

        int currentCost = rope1 + rope2;
        totalCost += currentCost;

        minHeap.push(currentCost);
    }

    return totalCost;
}
