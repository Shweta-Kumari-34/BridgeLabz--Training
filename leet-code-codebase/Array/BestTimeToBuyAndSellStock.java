class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int res = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > res) {
                res = prices[i] - buy;
            }
        }
        return res;
    }
}
