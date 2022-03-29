package leet1588;

public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int len = 1;
        while (len <= arr.length) {
            for (int i = 0; i <= arr.length - len; i++) {
                for (int j = i; j < len + i; j++) {
                    sum += arr[j];
                }
            }
            len += 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
    }
}
