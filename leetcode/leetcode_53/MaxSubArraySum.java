package leetcode_53;

public class MaxSubArraySum {
    // 暴力计算：超时
    public int maxSubArray(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        int ret = Integer.MIN_VALUE;


        // 这样遍历能确保每一个子数组都被计算到，从而求得最大值，但是提交会超时
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > ret) {
                    ret = sum;
                }
            }
        }

        return ret;
    }

    public int maxSubArray1(int[] nums) {
        int ret = nums[0];

        int sum = 0;
        for (int num : nums) {
            sum += num;
            ret = Math.max(ret, sum);

            if (sum < 0) {
                sum = 0;
            }

        }
        return ret;
    }

    public static void main(String[] args) {
        MaxSubArraySum instance = new MaxSubArraySum();

        System.out.println(instance.maxSubArray1(new int[]{-2, -1}));
    }

}
