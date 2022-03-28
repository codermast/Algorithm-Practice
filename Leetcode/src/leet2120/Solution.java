package leet2120;

import java.util.Arrays;

public class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int i = startPos[0];
        int j = startPos[1];

        int[] ret = new int[s.length()];
        for (int k = 0; k < s.length(); k++) {
            ret[k] = moveAct(s.substring(k), i, j,  n);
        }
        return ret;
    }

    // 行动
    public int moveAct(String s, int i, int j, int n) {
        int count = 0;
        for (int k = 0; k < s.length(); k++) {
            char c = s.charAt(k);
            switch (c) {
                case 'L':
                    j--;
                    break;
                case 'R':
                    j++;
                    break;
                case 'U':
                    i--;
                    break;
                case 'D':
                    i++;
                    break;
            }
            if (i < 0 || i >= n || j < 0 || j >= n) {
                break;
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] rrddlus = s.executeInstructions(3, new int[]{0, 1}, "RRDDLU");
        System.out.println(Arrays.toString(rrddlus));
    }
}
