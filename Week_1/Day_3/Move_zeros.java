package Week_1.Day_3;

import java.util.Arrays;
// LeetCode 283: Move Zeroes
// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int in=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                in=i;
                break;
            }
        }
        for(int i=in+1; i<nums.length; i++){
            if(nums[i]!=0 && in!=-1){
                nums[in]=nums[i];
                nums[i]=0;
                in++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}