package leet1518;

public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // 一共能喝多少瓶酒
        int  sum = numBottles;
        // 所有的瓶子总数
        int allBottle = numBottles;
        while( allBottle >= numExchange){
            // 当前循环兑换
            int change = allBottle / numExchange;
            // 剩余
            int surplus = allBottle % numExchange;

            sum += change;

            allBottle = change + surplus;
        }
        return sum;
    }
}
