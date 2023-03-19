package leet6319;

import java.util.Arrays;

public class Solution {
    // 下标从后往前数，则不用反转从前往后数
    public int[] evenOddBit(int n) {
        int[] ret = new int[2];
        int event = 0;
        int odd = 0;
        StringBuilder sb = new StringBuilder();

        while (n != 0){
            sb.append(n % 2);
            n /= 2;
        }

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '1' && i % 2 ==0){
                event++;
            }

            if (c == '1' && i % 2 == 1){
                odd++;
            }
        }
        ret[0] = event;
        ret[1] = odd;
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.evenOddBit(17)));
        System.out.println(Arrays.toString(s.evenOddBit(2)));
    }
}
