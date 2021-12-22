package problem.leet1365;

import java.util.Arrays;

public class Solution {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copyArr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copyArr);
        int[] retArr = new int[nums.length];
        int index = 0;
        for(int num : nums){
            for(int i = 0;i<copyArr.length;i++){
                if(num == copyArr[i]){
                    retArr[index] = i;
                    index++;
                    break;
                }
            }
        }
        return retArr;
    }

    public static void main(String[] args) {
        smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
    }
}
