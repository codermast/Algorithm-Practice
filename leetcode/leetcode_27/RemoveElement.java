package leetcode_27;

import java.util.LinkedList;
import java.util.List;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new LinkedList<>();

        for (int num : nums) {
            if (num != val) {
                list.add(num);
            }
        }
        int index = 0;
        for (Integer i : list) {
            nums[index++] = i;
        }

        return index;
    }

    // 双指针优化
    public int removeElement1(int[] nums, int val) {

        int left = 0;
        int right = nums.length - 1;


        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }



    public static void main(String[] args) {
        RemoveElement instance = new RemoveElement();

        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.println(instance.removeElement1(arr, 4));
    }
}
