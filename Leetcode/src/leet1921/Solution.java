package leet1921;

import java.util.Arrays;

public class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int[] count = new int[dist.length];

        for (int i = 0; i < dist.length; i++) {
            if (dist[i] % speed[i] == 0){
                count[i] = dist[i] / speed[i];
            }else {
                count[i] = dist[i] / speed[i] + 1;
            }
        }

        Arrays.sort(count);

        for (int i = 0; i < dist.length; i++) {
            // 该位置的无法被消灭，游戏终止，则共消灭了 i 个怪物
            if (count[i] <= i ){
                return i;
            }
        }
        return dist.length;
    }

    // 双循环法：理论上是能够实现的，但实际会超时
    public int eliminateMaximum2(int[] dist, int[] speed) {
        int[] count = new int[dist.length];

        for (int i = 0; i < dist.length; i++) {
            if (dist[i] % speed[i] == 0){
                count[i] = dist[i] / speed[i];
            }else {
                count[i] = dist[i] / speed[i] + 1;
            }
        }

        Arrays.sort(count);

        for (int i = 0; i < dist.length; i++) {
            // 使用此双重循环会导致超时
            boolean isEliminate = false;
            for (int j = 0; j < dist.length; j++) {
                if (count[j] != -1 && !isEliminate){
                    count[j] = -1;
                    isEliminate = true;
                    continue;
                }

                if (isEliminate){
                    count[j] --;
                    if (count[j] == 0){
                        return i + 1;
                    }
                }
            }
        }
        return dist.length;
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        int[] dist = {1,3,4};
        int[] speed = {1,1,1};

        int[] dist1 = {1,1,2,3};
        int[] speed1 = {1,1,1,1};

        int[] dist2 = {4,2,3};
        int[] speed2 = {2,1,1};
        System.out.println(s.eliminateMaximum(dist, speed));
        System.out.println(s.eliminateMaximum(dist1, speed1));
        System.out.println(s.eliminateMaximum(dist2, speed2));
    }
}
