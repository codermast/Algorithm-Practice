package problem.leet1486;

public class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];

        int ret = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
            ret ^= nums[i];
        }

        return ret;
    }
}
