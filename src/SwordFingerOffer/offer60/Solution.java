package SwordFingerOffer.offer60;

import java.util.*;


public class Solution {
    static class KeyValue{
        public int key;
        public int value;
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        PriorityQueue<KeyValue> queue = new PriorityQueue<>(k,new Comparator<KeyValue>() {
            @Override
            public int compare(KeyValue o1, KeyValue o2) {
                return o1.value - o2.value;
            }
        });

        for (int i : nums){
            KeyValue keyValue = new KeyValue();
            keyValue.key = i;
            keyValue.value = map.get(i);

            queue.offer(keyValue);
        }
        int[] ret = new int[k];
        for(int i = 0;!queue.isEmpty();i++){
            ret[i] = queue.poll().key;
        }
        return ret;
    }

}
