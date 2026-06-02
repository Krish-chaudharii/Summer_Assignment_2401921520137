package Week_1.Day_2;
// LeetCode 217: Contains Duplicate
// Approach: HashSet
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dup=new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(!dup.contains(nums[i])){
                dup.add(nums[i]);
            }
            else return true;
        }

        return false;
    }
}