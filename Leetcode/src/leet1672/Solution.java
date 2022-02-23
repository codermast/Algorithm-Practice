package leet1672;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] arr : accounts){
            int sum = 0;
            for(int i : arr){
                sum += i;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
