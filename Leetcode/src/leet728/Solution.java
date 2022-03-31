package leet728;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ret = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            String s = String.valueOf(i);
            boolean isTrue = true;
            for (int j = 0; j < s.length(); j++) {
                int num = Integer.parseInt(String.valueOf(s.charAt(j)));
                if (num == 0 || i % num != 0) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                ret.add(i);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        for (Integer integer : s.selfDividingNumbers(1, 22)) {
            System.out.println(integer);
        }
    }
}
