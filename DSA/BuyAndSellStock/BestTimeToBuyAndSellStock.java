public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // update minPrice if current price is lower
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // calculate maxProfit
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);
    }
}

