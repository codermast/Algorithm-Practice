package leet018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ret = new LinkedList<>();
        // 如果数组不存在或者数组内的数小于4个，则无法计算四数之和
        if (nums == null || nums.length < 4){
            return ret;
        }
        // 数组排序
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]){
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;

                while (left<right){
                    // 这里可能会出现大数值，导致溢出
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum < target){
                        do{
                            left ++;
                        }while (left < right && nums[left] == nums[left -1]);
                    }else if (sum > target){
                        do{
                            right --;
                        }while (right > left && nums[right] == nums[right + 1]);
                    }else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        ret.add(list);
                        do{
                            left ++;
                        }while (left < right && nums[left] == nums[left -1]);
                    }
                }

            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};

        int[] arr2 = {-2,-1,-1,1,1,2,2};

        int[] arr3 = {1000000000,1000000000,1000000000,1000000000};
        Solution s = new Solution();
        List<List<Integer>> lists = s.fourSum(arr3, -294967296);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.printf(integer + " ");
            }
            System.out.println();
        }
    }
}
