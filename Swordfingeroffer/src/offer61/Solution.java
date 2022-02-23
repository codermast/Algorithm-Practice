package offer61;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = 14;
        int max = 0;
        for(int i : nums){
            if(i == 0){
                continue;
            }
            if(set.contains(i)){
                return false;
            }else{
                set.add(i);
            }

            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        return max - min < 5;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,2,2,5};
        System.out.println(isStraight(arr));
    }
}
