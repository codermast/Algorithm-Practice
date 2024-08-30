package leetcode_122;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];

            if (diff > 0){
                maxProfit += diff;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit instance = new MaxProfit();
        System.out.println(instance.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
