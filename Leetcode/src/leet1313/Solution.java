package leet1313;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }
        int[] ret = new int[list.size()];
        for (int i = 0;i<ret.length;i++){
            ret[i] = list.get(i);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(decompressRLElist(arr)));
    }
}
