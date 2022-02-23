package offer03;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findRepeatNumber(int[] nums){
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.replace(nums[i], map.get(nums[i]) + 1);
            }else {
                map.putIfAbsent(nums[i], 1);
            }
        }

        for(int i : map.keySet()){
            if(map.get(i) > 1){
                return i;
            }
        }
        // 不存在返回 -1
        return -1;
    }
}
