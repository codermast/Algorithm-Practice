package leet136;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {

    /*
    *   Map 进行实现
    * */
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entries) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return -1;
    }

    /*
    *   位运算进行实现
    * */
    public int singleNumber2(int[] nums) {
        int ret = 0;
        for(int i : nums){
            ret = ret ^ i;
        }
        return ret;
    }

}
