package problem.leet373;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        // 越小的放在最前面
        PriorityQueue<List<Integer>> queue = new PriorityQueue<>(k, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return  (o2.get(0) + o2.get(1)) - (o1.get(0) + o1.get(1));
            }
        });

        for (int i = 0;i<Math.min(nums1.length, k);i++) {
            for (int j = 0;j<Math.min(nums2.length, k);j++) {
                List<Integer> list = new LinkedList<>();
                list.add(nums1[i]);
                list.add(nums2[j]);
                if(queue.size() < k){
                    queue.add(list);
                }else{
                    int peek = queue.peek().get(0) + queue.peek().get(1);
                    if(list.get(0) + list.get(1) < peek){
                        queue.poll();
                        queue.add(list);
                    }
                }
            }
        }

        List<List<Integer>> ret = new LinkedList<>();

        for(int i = 0;i<k && !queue.isEmpty();i++){
                ret.add(queue.poll());
        }
        return  ret;
    }
}
