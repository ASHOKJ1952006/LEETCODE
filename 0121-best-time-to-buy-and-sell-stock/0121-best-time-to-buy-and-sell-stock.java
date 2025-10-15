class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // Track the lowest price so far
        int maxProfit = 0;                 // Track the highest profit so far

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;          // Update min price when we find a lower one
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;  // Update profit if we find a better one
            }
        }

        return maxProfit;
    }
}
