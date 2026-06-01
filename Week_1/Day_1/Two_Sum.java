// LeetCode 1: Two Sum
// Approach: Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)
//https://leetcode.com/problems/two-sum/
// may be later solved using hashmap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}