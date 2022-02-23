package problem.leet349;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums1){
            for(int j : nums2){
                if(i == j){
                    set.add(j);
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
