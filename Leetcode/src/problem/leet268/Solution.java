package problem.leet268;

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int sumAll = 0;
        for(int i : nums){
            sum += i;
        }

        for(int i = 0;i<=nums.length;i++){
            sumAll += i;
        }
        return sumAll - sum;
    }
}
