package Week_1.Day_4;
// LeetCode 1572: Matrix Diagonal Sum
// Approach: Two Loops
// Time Complexity: O(n)
// Space Complexity: O(1)
//https://leetcode.com/problems/matrix-diagonal-sum/

// class Solution {
//     public int diagonalSum(int[][] mat) {
//         int sum = 0;
//         for(int i=0; i<mat.length; i++){
//             sum += mat[i][i]; //primary
//             if(i != mat.length-i-1){
//                 sum += mat[i][mat.length-i-1];  //secondary
//             }
//         }
//         return sum;
//     } 
// }
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;

        //primary diagonal
        for(int i=0; i<mat.length; i++){
            sum += mat[i][i];
        }

        //secondary diagonal
        for(int i=mat.length-1; i>=0; i--){
            int j=mat.length-1-i;
            if (i!=j) sum += mat[i][j];
        }
        return sum;
    }
}