package Week_1.Day_3;
// LeetCode 11: Container With Most Water
// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)
//https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int lwall=0;
        int rwall=height.length-1;
        int area=0;
        int maxarea=0;

        while(lwall<rwall){
            area= (rwall-lwall) * Math.min(height[rwall],height[lwall]);

            if(area>maxarea){
                maxarea=area;
            }
            
            if(height[lwall]<=height[rwall]) lwall++;
            else rwall--;
        }
        return maxarea;
    }
}