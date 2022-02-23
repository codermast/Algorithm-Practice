package leet215;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
//        if(k == 0 || nums.length == 0){
//            throw new NoSuchElementException("元素为空！");
//        }

        if(k == 0 || nums.length == 0){
            return -1;
        }
        // 大堆
        PriorityQueue<Integer> queue = new PriorityQueue(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for(int i : nums){
            if(queue.size() < k){
                queue.add(i);
            }else{
                int peek = queue.peek();
                if(peek < i){
                    queue.poll();
                    queue.add(i);
                }
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.findKthLargest(new int[]{3,2,1,5,6,4},2);
    }
}
