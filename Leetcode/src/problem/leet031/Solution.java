//package problem.leet031;
//
//import java.util.Arrays;
//
//public class Solution {
//    public void nextPermutation(int[] nums) {
//        for (int i = nums.length - 1; i > 0; i--) {
//            for (int j = i - 1; j >= 0; j--) {
//                if (nums[i] > nums[j]) {
//                    int tmp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = tmp;
//                    return;
//                }
//            }
//        }
//        // 不存在则将数组升序
//        Arrays.sort(nums);
//    }
//
//    public static void main(String[] args) {
//        Solution s = new Solution();
//
//        int[] arr = {1, 2, 3};
//        s.nextPermutation(arr);
//        System.out.println(Arrays.toString(arr));
//
//        arr = new int[]{1, 1, 5};
//        s.nextPermutation(arr);
//        System.out.println(Arrays.toString(arr));
//
//        arr = new int[]{3, 2, 1};
//        s.nextPermutation(arr);
//        System.out.println(Arrays.toString(arr));
//
//        arr = new int[]{1};
//        s.nextPermutation(arr);
//        System.out.println(Arrays.toString(arr));
//
//        arr = new int[]{1, 3, 2};
//        s.nextPermutation(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}
