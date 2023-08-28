package leet057;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] arr = Arrays.copyOf(intervals, intervals.length + 1);

        arr[arr.length - 1] = newInterval;

        return merge(arr);
    }

    // 合并区间
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][0];
        }

        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] > o2[0] || o1[0] < o2[0]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });

        int i = 0;
        int j = 1;

        List<int[]> ret = new ArrayList<>();

        while (j <= intervals.length) {
            if (j == intervals.length) {
                ret.add(intervals[i]);
                break;
            }

            // 前一项的大值 >= 后一项的小值，则可以进行合并
            if (intervals[i][1] >= intervals[j][0]) {
                intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
            } else {
                int[] item = {Math.min(intervals[i][0], intervals[j - 1][0]), Math.max(intervals[i][1], intervals[j - 1][1])};
                ret.add(item);
                i = j;
            }
            j++;
        }

        return ret.toArray(new int[ret.size()][]);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = {{1, 5}};

        int[] newInterval = {6, 8};
        int[][] insert1 = s.insert(arr, newInterval);
        for (int[] ints : insert1) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
