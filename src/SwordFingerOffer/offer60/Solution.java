package SwordFingerOffer.offer60;

import java.util.*;


public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ret = new int[k];
        if(k == 0){
            return ret;
        }
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<int[]> queue = new PriorityQueue(k, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int[] arr = new int[2];
            arr[0] = entry.getKey();
            arr[1] = entry.getValue();
            if(queue.size() < k){
                queue.add(arr);
            }else{
                if(queue.peek()[1] < entry.getValue()){
                    queue.poll();
                    queue.add(arr);
                }
            }
        }

        for(int i = 0;i<k;i++){
            int[] poll = queue.poll();
            ret[i] = poll[0];
        }
        return ret;
    }
}
