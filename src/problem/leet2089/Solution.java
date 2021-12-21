package problem.leet2089;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new LinkedList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                list.add(i);
            }
        }
        return list;
    }
}