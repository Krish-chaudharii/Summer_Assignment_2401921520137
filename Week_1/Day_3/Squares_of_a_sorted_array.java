package Week_1.Day_3;
// LeetCode 977: Squares of a Sorted Array
// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(n)
//https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans= new int[nums.length];

        int l=0;
        int r=nums.length-1;

        for(int i=nums.length-1; i>=0; i--){
            if(Math.abs(nums[r])>=Math.abs(nums[l])){
                ans[i]=nums[r]*nums[r];
                r--;
            }
            else{
                ans[i]=nums[l]*nums[l];
                l++;
            }
        }

        return ans;
    }
}