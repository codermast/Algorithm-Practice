package leet217;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            if(map.containsKey(n)){
                return true;
            }else{
                map.put(n,1);
            }
        }
        return false;
    }
}