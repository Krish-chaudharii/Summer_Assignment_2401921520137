package Week_1.Day_2;

// LeetCode 53: Maximum Subarray
// Approach: Kadane's Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)
//https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum= nums[0];
        int bestsum= nums[0];

        for(int i=1;i<nums.length;i++){
            if(currentsum+nums[i]>nums[i]){
                currentsum += nums[i];
            }
            else currentsum= nums[i];

            if (currentsum > bestsum) bestsum=currentsum;
        }

        return bestsum;
    }
}