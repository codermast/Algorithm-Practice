package problem.leet414;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }
        int[] ret = new int[set.size()];
        int i = 0;
        for (Integer integer : set) {
            ret[i] = integer;
            i++;
        }
        Arrays.sort(ret);

        if(ret.length >= 3){
            return ret[ret.length - 3];
        }else{
            return ret[ret.length - 1];
        }
    }
}
