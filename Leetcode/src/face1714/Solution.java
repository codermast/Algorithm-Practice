package face1714;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] smallestK(int[] arr, int k) {

        int[] ret = new int[k];
        if(k == 0){
            return new int[0];
        }
        Queue<Integer> queue = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for(int i : arr){
            if(queue.size() < k){
                queue.add(i);
            }else{
                if(queue.peek() > i){
                    queue.poll();
                    queue.add(i);
                }
            }
        }

        for(int i = 0;i<k;i++){
            ret[i] = queue.poll();
        }
        return ret;
    }
}
