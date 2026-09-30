class Solution {
    public int maxProfit(int[] prices) {

        int current = 0;
        int best = 0;

        for(int i = 1; i < prices.length; i++) {

            int diff = prices[i] - prices[i - 1];

            current = Math.max(0, current + diff);

            best = Math.max(best, current);
        }

        return best;
    }
}