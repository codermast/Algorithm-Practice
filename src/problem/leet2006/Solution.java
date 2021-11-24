package problem.leet2006;

public class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(i < j && Math.abs(nums[i]-nums[j]) == k){
                    count ++;
                }
            }
        }
        return count;
    }
    /*
    *   测试方法
    * */
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,2,2,1};
        int k = 1;

        System.out.println(s.countKDifference(arr, k));
    }
}
