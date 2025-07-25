// 338. Counting Bits
// Solved
// Easy
// Topics
// premium lock icon
// Companies


// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

 

// Example 1:

// Input: n = 2
// Output: [0,1,1]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
// Example 2:

// Input: n = 5
// Output: [0,1,1,2,1,2]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
// 3 --> 11
// 4 --> 100
// 5 --> 101
 

// Constraints:

// 0 <= n <= 105
#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> bits;
        int temp,numOfOnes ;
        for(int i= 0;i<=n;i++){
            numOfOnes = 0;
            temp = i;
            while(temp){
                numOfOnes += (temp & 1);
                temp >>= 1;
            }
            bits.push_back(numOfOnes);
        }
        return bits;
    }
};
int main(){
    
}