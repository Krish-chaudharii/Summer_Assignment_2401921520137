package Week_1.Day_1;

// LeetCode 121: Best Time to Buy and Sell Stock
// Approach: Track minimum buying price and maximum profit
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < buy) {
                buy = prices[i];
            }
            int currentProfit = prices[i] - buy;
            if(currentProfit > profit) {
                profit = currentProfit;
            }
        }
        return profit;
    }
}