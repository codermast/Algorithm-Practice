package SwordFingerOffer.offer17;

//https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/

public class Solution {
    public int[] printNumbers(int n) {
        int target = (int) (Math.pow(10,n) - 1);
        int[] arr = new int[target];

        for(int i = 1;i<=target;i++){
            arr[i - 1] = i;
        }
        return arr;
    }
}
