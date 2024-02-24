package DAY_1_ARRAY;

 class StockBuyAndSell {
  
    public int maxProfit(int[] prices) {
        // Initialize maxprofit to the lowest possible value
        int maxprofit = Integer.MIN_VALUE;
        // Initialize min to the highest possible value
        int min = Integer.MAX_VALUE;
        
        // Iterate through the prices array
        for (int i = 0; i < prices.length; i++) {
            // Update the minimum price encountered so far
            min = Math.min(min, prices[i]);
            // Calculate the current profit by subtracting the minimum price from the current price
            int currentProfit = prices[i] - min;
            // Update the maximum profit if the current profit is greater
            maxprofit = Math.max(maxprofit, currentProfit);
        }
        
        // Return the maximum profit
        return maxprofit;
    }
    
        public static void main(String[] args) {
            // Example usage
           StockBuyAndSell stock= new StockBuyAndSell();
            int[] prices = {7, 1, 5, 3, 6, 4};
            int maxProfit = stock.maxProfit(prices);
            System.out.println("Maximum profit: " + maxProfit);
        }
    }
