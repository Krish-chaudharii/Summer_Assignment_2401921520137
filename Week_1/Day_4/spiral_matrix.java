package Week_1.Day_4;
// LeetCode 54: Spiral Matrix
// Approach: Four Loops
// Time Complexity: O(n*m)
// Space Complexity: O(n*m)
//https://leetcode.com/problems/spiral-matrix/

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> l = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right) {

            // Top Row
            for(int i = left; i <= right; i++) {
                l.add(matrix[top][i]);
            }
            top++;

            // Right Column
            for(int i = top; i <= bottom; i++) {
                l.add(matrix[i][right]);
            }
            right--;

            // Bottom Row
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    l.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Left Column
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    l.add(matrix[i][left]);
                }
                left++;
            }
        }

        return l;
    }
}
