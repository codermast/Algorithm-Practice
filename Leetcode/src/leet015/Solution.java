package leet015;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    /*
     *   三重循环，暴力解法
     * */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new LinkedList<>();

        // 这里让k < nums.length - 2 ，是保证k在i和j之前。
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) {
                // 如果连最小的数都是 > 0 ，那么后面的数都是比他大的数，则相加之后必为一个 > 0 的数
                break;
            }

            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }

            int i = k + 1;
            int j = nums.length - 1;

            while (i < j) {
                // nums[i] == nums[i - 1]时，直接跳过即可，因为结果和nums[i - 1]一致
                if (i >= k + 2) {
                    if (nums[i] == nums[i - 1]) {
                        i++;
                        continue;
                    }
                }
                // nums[j] == nums[j + 1]时，直接跳过即可，因为结果和nums[j + 1]一致
                if (j < nums.length -1) {
                    if (nums[j] == nums[j + 1]) {
                        j--;
                        continue;
                    }
                }

                // 判断三者之和是否为0
                if (nums[k] + nums[i] + nums[j] == 0) {
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[k]);
                    list.add(nums[i]);
                    list.add(nums[j]);

                    ret.add(list);
                    // 这里将i和j都进行更新，原因是：在k不变的情况下，三者之和为0，那么当i++单独执行后，且不与之前的值重复，则更新后的三者必不可能为0，必大于0，此时则需要将 j--；
                    //                                                      反之，仅仅更新j--，则三者之和必小于0，此时需要更新i++，即该操作是需要将两者同时进行更新的，如果只更新一个，那么会多循环一次。
                    i++;
                    j--;
                } else if (nums[k] + nums[i] + nums[j] > 0) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        Solution solution = new Solution();
        System.out.println(solution.threeSum(arr));
    }
}
