package Week_1.Day_2;
// LeetCode 643: Maximum Average Subarray I
// Approach: Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currentsum=0;
        
        for(int i=0; i<k; i++){
            currentsum +=nums[i];
        }
        
        int bestsum=currentsum;

        for(int i=k; i<nums.length; i++){
            currentsum=currentsum - nums[i-k] +nums[i];
            if (currentsum>bestsum) bestsum=currentsum;
        }

        double avg= (double)bestsum / k;
        return avg;
    }
}