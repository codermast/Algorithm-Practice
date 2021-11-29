package problem.leet496;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ret = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
            int retNum = -1;
            for(int j = 0;j< nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    if(j == nums2.length - 1){
                        break;
                    }
                    for(int k = j + 1;k<nums2.length;k++){
                        if(nums2[k] > nums1[i]){
                            retNum = nums2[k];
                            break;
                        }
                    }
                }
            }

            ret[i] = retNum;
        }
        return ret;
    }
}
