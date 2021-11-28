package SwordFingerOffer.offer56_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> hashmap : map.entrySet()) {
            if (hashmap.getValue() == 1){
                return hashmap.getKey();
            }
        }
        return -1;
    }
}
