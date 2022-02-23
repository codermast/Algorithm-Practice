package leet027;

public class Solution {
    public int removeElement(int[] nums, int val) {
        // 保存删除后的数组长度
        int length = nums.length;

        if(length == 1){
            if(nums[0] == val){
                return 0;
            }else{
                return 1;
            }
        }

        int ret = -1;

        for(int i = 0;i<length;i++){
            for(int j = length - 1;j>=i;j--){
                if(nums[i] == val && nums[j] != val){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    ret = i;
                }
                if(nums[i] != val){
                    ret = i;
                }
            }
        }
        if(ret == -1){
            return 0;
        }
        return ret + 1;
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] arr = {3,3,2};
        System.out.println(s.removeElement(arr, 3));
    }
}
