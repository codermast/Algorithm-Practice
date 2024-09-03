package leetcode_55;

public class CanJump {

    // 通过辅助数组记录可到达的范围，从而判断是否可到达最后一个位置，O(n^2)
    public boolean canJump(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i]; j++) {
                if (i + j < nums.length){
                    arr[i + j] = 1;
                }
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (arr[i] == 0){
                return false;
            }
        }
        return true;
    }

    // 贪心算法：仅记录最远能到的下标位置 O(n)
    public boolean canJump1(int[] nums) {
        int maxFar = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxFar){
                return false;
            }

            maxFar = Math.max(maxFar, i + nums[i]);
        }

        return maxFar >= nums.length - 1;
    }

    public static void main(String[] args) {
        CanJump instance = new CanJump();

        int[] arr = {2, 3, 1, 1, 4};

        System.out.println(instance.canJump1(arr));
    }
}
