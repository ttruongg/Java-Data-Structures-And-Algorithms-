
public class Main {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            int profit = prices[i] - min;
            maxProfit = Math.max(profit, maxProfit);
        }


        return maxProfit;


    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));

    }
}