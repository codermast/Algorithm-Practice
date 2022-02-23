package leet1646;

public class Solution {

    public int getMaximumGenerated(int n) {
        if(n == 0){
            return 0;
        }
        // 定义所需填充数组
        int[] nums = new int[n + 1];

        // 初始化默认值
        nums[0] = 0;
        nums[1] = 1;

        // 记录最大值
        int max = nums[0];

        // 循环遍历
        for (int i = 0;i <= n;i++){
            if (2 <= 2 * i && 2 * i <= n){
                nums[2 * i] = nums[i];
            }

            if (2 <= 2 * i + 1 && 2 * i + 1 <= n){
                nums[2 * i + 1] = nums[i] + nums[i + 1];
            }

            max = Math.max(max,nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        s.getMaximumGenerated(4);
        s.getMaximumGenerated(5);
        s.getMaximumGenerated(6);
        s.getMaximumGenerated(7);
        s.getMaximumGenerated(14);
        s.getMaximumGenerated(24);
        s.getMaximumGenerated(44);
        s.getMaximumGenerated(84);

    }
}
