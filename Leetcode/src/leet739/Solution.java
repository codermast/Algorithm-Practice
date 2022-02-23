package leet739;

import java.util.Arrays;

public class Solution {
        public static int[] dailyTemperatures(int[] temperatures) {
            int[] ret = new int[temperatures.length];
            // 外层循环控制是第几个数
            for (int i = 0;i<temperatures.length;i++){
                int count = 0;
                // 内层循环判断到什么时候出现比当前大的值
                for (int j = i; j < temperatures.length; j++) {
                    // 如果出现则加入返回值，并且跳出
                    if (temperatures[i] < temperatures[j]){
                        ret[i] = count;
                        break;
                    // 否则继续判断，并且数量加加
                    }else{
                        count++;
                    }
                }
            }
            return ret;
        }

    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }
}
