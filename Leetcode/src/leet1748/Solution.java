package leet1748;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1){
                sum += entry.getKey();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[]{1,2,3,4}));
    }
}
