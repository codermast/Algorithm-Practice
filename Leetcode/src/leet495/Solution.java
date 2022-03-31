package leet495;

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ret = 0;
        int endTime = 0;
        for (int timeSery : timeSeries) {
            if (timeSery >= endTime) {
                ret += duration;
            } else {
                ret += timeSery - endTime + duration;
            }
            endTime = timeSery + duration;
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 5, 20};
        System.out.println(s.findPoisonedDuration(arr, 2));
    }
}
