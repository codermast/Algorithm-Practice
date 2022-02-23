package leet628;

public class Solution {

    /*
    *   只需要找出最小的两个数和最大的三个数
    * */
    public int maximumProduct(int[] nums) {
        // 最小的两个数
        // 第一小
        int min1 = Integer.MAX_VALUE;
        // 第二小
        int min2 = Integer.MAX_VALUE;
        // 最大的三个数
        // 第一大
        int max1 = Integer.MIN_VALUE;
        // 第二大
        int max2 = Integer.MIN_VALUE;
        // 第三大
        int max3 = Integer.MIN_VALUE;

        for(int i : nums){
            if(i > max1){
                max3 = max2;
                max2 = max1;
                max1 = i;
            }else if(i > max2){
                max3 = max2;
                max2 = i;
            }else{
                max3 = Math.max(i,max3);
            }

            if(i < min1){
                min2 = min1;
                min1 = i;
            }else{
                min2 = Math.min(i,min2);
            }
        }
        return Math.max(max1 * max2 * max3,min1 * min2 * max1);
    }
}
