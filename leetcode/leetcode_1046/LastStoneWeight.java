package leetcode_1046;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            // 按照降序排列
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        // 构建大顶堆
        for (int stone : stones) {
            heap.offer(stone);
        }

        while (heap.size() > 1) {
            int maxStone = heap.poll();
            int secondMaxStone = heap.poll();

            if (maxStone != secondMaxStone) {
                heap.offer(maxStone - secondMaxStone);
            }
        }

        if (heap.size() == 1) {
            return heap.poll();
        } else {
            return 0;
        }
    }
}
