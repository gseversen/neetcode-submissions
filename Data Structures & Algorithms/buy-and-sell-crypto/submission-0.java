class Solution {
    public int maxProfit(int[] prices) {
        
        int ans = 0;
        int temp = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = prices.length -1; j > i; j--) {
                temp = prices[j] - prices[i];
                ans = Math.max(ans, temp);
            }
        }
        return ans;
    }
}
