package Week_1.Day_1;

// Remove Duplicates from Sorted Array 
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/ 
// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int p1=Integer.MIN_VALUE; //since constraints says nums[i] is between -100 to 100

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=p1){
                nums[k]=nums[i];
                k++;
                p1=nums[i];
            }
        }
        return k;
    }
}