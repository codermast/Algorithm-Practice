package leet122;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1){
            return 0;
        }

        int[] ret = new int[prices.length - 1];

        for (int i = 1; i < prices.length; i++) {
            ret[i - 1] = prices[i] - prices[i -1];
        }

        int sum = 0;
        for (int i : ret) {
            if (i > 0){
                sum += i;
            }
        }
        return sum;
    }
}
