package leetcode_560;

public class SubArraySumEqualsK {

    // 1. 暴力匹配 [超时]
    public int subarraySum(int[] nums, int k) {
        int arrLen = nums.length;
        int sum = 0;
        while (arrLen > 0) {
            for (int i = 0; i < nums.length - arrLen + 1; i++) {
                if (arrSum(nums, i, i + arrLen - 1) == k) {
                    sum++;
                }
            }
            arrLen--;
        }
        return sum;
    }

    // 数组求和
    public int arrSum(int[] arr, int i, int j) {
        int sum = 0;
        while (i <= j) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    // 2. 优化
    public int subarraySum1(int[] nums, int k) {
        return 0;
    }

}
