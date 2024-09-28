package leetcode_560;

public class SubArraySumEqualsK {

    // 枚举暴力匹配
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int end = 0; end < nums.length; end++) {
            int sum = 0;
            for (int start = end; start >=0; start--) {
                sum += nums[start];

                if (sum == k){
                    count++;
                }
            }
        }

        return count;
    }

    // TODO: 前缀和+哈希表优化 时间 O(n) 空间 O(n)
}
