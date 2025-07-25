// 342. Power of Four
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given an integer n, return true if it is a power of four. Otherwise, return false.

// An integer n is a power of four, if there exists an integer x such that n == 4x.

 

// Example 1:

// Input: n = 16
// Output: true
// Example 2:

// Input: n = 5
// Output: false
// Example 3:

// Input: n = 1
// Output: true
 

// Constraints:

// -231 <= n <= 231 - 1
#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    bool isPowerOfFour(int n) {
        double power = 1;
        bool flag = true;
        if(n>0){    
           while(flag){
            if(power>n){
                flag = false;
            }
            if(power == n){
                return true;
            }
            power *= 4;
           }
        } 
                return false;
        
    }
};
int main(){
    Solution s;
    cout<<s.isPowerOfFour(16);
    return 0;
}