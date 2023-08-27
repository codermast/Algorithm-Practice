package leet056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
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

        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        //int[][] arr = {{5, 6}, {1, 2}, {2, 4}, {5,5}, {5,5}, {3,3}};
        //int[][] arr = {{1, 4},{2, 3}};

        int[][] merge = s.merge(arr);

        for (int[] ints : merge) {
            System.out.println(Arrays.toString(ints));
        }
    }
}

