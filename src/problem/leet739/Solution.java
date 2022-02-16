package problem.leet739;

import java.util.Arrays;

public class Solution {
        public static int[] dailyTemperatures(int[] temperatures) {
            int[] ret = new int[temperatures.length];
            for (int i = 0;i<temperatures.length;i++){
                int count = 0;
                for (int j = i; j < temperatures.length; j++) {
                    if (temperatures[i] < temperatures[j]){
                        ret[i] = count;
                        break;
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
