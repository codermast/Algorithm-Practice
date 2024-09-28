package leetcode_239;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxSlidingWindow {

    static class Pair {
        int number;
        int index;

        public Pair(int number, int index) {
            this.index = index;
            this.number = number;
        }

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ret = new int[nums.length - k + 1];

        // 使用优先级队列来保存最大的
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(k, new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2) {
                return p2.number - p1.number;
            }
        });

        for (int i = 0; i < k; i++) {
            priorityQueue.add(new Pair(nums[i], i));
        }

        ret[0] = priorityQueue.peek().number;

        for (int i = k; i < nums.length; i++) {
            // 将新元素加入到队列中
            priorityQueue.add(new Pair(nums[i], i));

            // 判断最大值是否在窗口内
            while (!(priorityQueue.peek().index <= i  && priorityQueue.peek().index >= i - k + 1)){
                // 最大值不在窗口内，则弹出最大值，直到最大值在窗口内即可
                priorityQueue.poll();
            }
            ret[i - k + 1] = priorityQueue.peek().number;
        }

        ret[ret.length - 1] = priorityQueue.poll().number;

        return ret;
    }

    public static void main(String[] args) {
        MaxSlidingWindow instance = new MaxSlidingWindow();

        int[] nums = {1,-1};
        int k = 1;
        instance.maxSlidingWindow(nums, k);
    }
}
