package leetcode_215;

import java.util.PriorityQueue;

public class ArrayKthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        if (k < 1 || nums.length < k) {
            return -1;
        }

        // 构建一个小顶堆
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, (o1, o2) -> o2 - o1);

        // 遍历数组
        for (int num : nums) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}
