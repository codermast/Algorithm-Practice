package problem.leet350;

import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();

        for(int i : nums1){
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        for(int i : nums2){
            if(map.containsKey(i)){
                if(map.get(i) != 0){
                    map.put(i, map.get(i) - 1);
                    list.add(i);
                }
            }
        }
        int[] ret = new int[list.size()];
        int index = 0;
        for (Integer integer : list) {
            ret[index] = integer;
            index ++;
        }

        return ret;
    }
}
