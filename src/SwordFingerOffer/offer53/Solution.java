package SwordFingerOffer.offer53;

public class Solution {

    /*
    *
    *   因为给定的数组已经是排序好的，所以当大于的时候，就没必要再进行判断了。
    * */
    public int search(int[] nums, int target) {
        int count = 0;
        for(int i : nums){
            if(i == target){
                count++;
            }
            if(i > target){
                break;
            }
        }
        return count;
    }
}
