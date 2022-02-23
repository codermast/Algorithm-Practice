package leet121;

public class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int max = 0;

        for(int i : prices){
            if(i < minprice){
                minprice = i;
            }

            if(i - minprice > max){
                max = i -minprice;
            }
        }
        return max;
    }
}
