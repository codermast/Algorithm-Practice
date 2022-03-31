package leet055;

public class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1){
            return true;
        }
        int cover = 0;
        for (int i = 0; i <= cover; i++) {
            // 在覆盖范围内进行遍历。
            cover = Math.max(cover,i + nums[i]);

            // 全部覆盖，则说明可以到达
            if (cover >= nums.length - 1){
                return true;
            }
        }
        return cover >= nums.length - 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.canJump(new int[]{3,2,1,0,4}));
    }
}
