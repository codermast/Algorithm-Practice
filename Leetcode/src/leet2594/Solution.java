package leet2594;


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] ranks = {5, 1, 8};

        System.out.println(s.repairCars(ranks, 6));

        System.out.println(s.repairCars(new int[]{4, 7, 3, 7, 3, 6}, 409));
    }

    // 对最大时间和最小时间进行二分查找
    public long repairCars(int[] ranks, int cars) {

        long min = Arrays.stream(ranks).min().getAsInt();

        long minTime = 0;
        long maxTime = min * cars * cars;


        long midTime;

        while (minTime + 1 < maxTime) {
            long carCount = 0;

            midTime = (maxTime + minTime) >> 1;

            for (int rank : ranks) {
                carCount += (long) Math.sqrt((double) midTime / rank);
            }

            if (carCount >= cars) {
                maxTime = midTime;
            } else {
                minTime = midTime;
            }
        }
        return maxTime;
    }
}
