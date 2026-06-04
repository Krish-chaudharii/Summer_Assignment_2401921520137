package Week_1.Day_4;
// LeetCode 566: Reshape the Matrix
// Approach: Two Loops
// Time Complexity: O(n*m)
// Space Complexity: O(r*c)
//https://leetcode.com/problems/reshape-the-matrix/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] nmat= new int[r][c];
        int nr=0;
        int nc=0;

        if(mat.length*mat[0].length == r*c){
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat[i].length; j++){
                    nmat[nr][nc]=mat[i][j];
                    nc++;

                    if(nc==c){
                        nc=0;
                        nr++;
                    }
                }
            }
            return nmat;
        }

        return mat;
    }
}