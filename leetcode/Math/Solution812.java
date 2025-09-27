// 812. Largest Triangle Area
// Easy
// Topics
// premium lock icon
// Companies
// Given an array of points on the X-Y plane points where points[i] = [xi, yi], return the area of the largest triangle that can be formed by any three different points. Answers within 10-5 of the actual answer will be accepted.

 

// Example 1:


// Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
// Output: 2.00000
// Explanation: The five points are shown in the above figure. The red triangle is the largest.
// Example 2:

// Input: points = [[1,0],[0,0],[0,1]]
// Output: 0.50000
 

// Constraints:

// 3 <= points.length <= 50
// -50 <= xi, yi <= 50
// All the given points are unique.

class Solution {
    public double largestTriangleArea(int[][] points) {
        int len = points.length;
        double maxArea = 0.0 ,area;
        double x1,y1,x2,y2,x3,y3;
        
        for(int i = 0 ; i < len; i++){
            for(int j = i+1; j < len; j++){
                for(int k = j+1; k < len; k++){
                    x1 = points[i][0];
                    y1 = points[i][1];
                    x2 = points[j][0];
                    y2 = points[j][1];
                    x3 = points[k][0];
                    y3 = points[k][1];

                    // Find area using shoelace formula
                    area = 0.5 * Math.abs( (x1 * (y2-y3)) +( x2 * (y3-y1 )) + (x3 * (y1-y2)));
                    maxArea = Math.max(area,maxArea);
                }
            }
        }
        return maxArea;
    }
}