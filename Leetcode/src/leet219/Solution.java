package leet219;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.get(nums[i]) == null){
                List<Integer> list = new LinkedList<>();
                list.add(i);
                map.put(nums[i],list);
            }else{
                List<Integer> list = map.get(nums[i]);
                for(Integer integer : list){
                    if(Math.abs(i - integer) <= k){
                        return true;
                    }
                }
                list.add(i);
                map.put(nums[i],list);
            }
        }
        return false;
    }
}
