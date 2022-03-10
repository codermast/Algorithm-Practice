package leet011;

public class Solution {
    public int maxArea(int[] height) {
        int volume = 0;

        int i = 0;
        int j = height.length - 1;

        while (i != j) {
            if (height[i] < height[j]) {
                volume = Math.max(volume, (j - i) * height[i]);
                i++;
            } else {
                volume = Math.max(volume, (j - i) * height[j]);
                j--;
            }
        }
        return volume;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 1};
        System.out.println(s.maxArea(arr));
    }
}
