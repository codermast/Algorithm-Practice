package leet1464;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    /*
    *   这里没有考虑到有负数和零的存在，只适用于正数
    * */
    public int maxProduct(int[] nums) {
        // 小根堆
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(i != j){
                    int num = (nums[i] - 1) * (nums[j] - 1);
                    queue.add(num);
                }
            }
        }
        return queue.peek();
    }
}
