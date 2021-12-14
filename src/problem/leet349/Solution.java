package problem.leet349;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
        Integer[] integers = set.toArray(new Integer[0]);
        int[] ret = new int[set.size()];
        int i = 0;
        for (Integer integer : integers) {
            ret[i] = integer;
            i ++;
        }
        return ret;
    }
}
