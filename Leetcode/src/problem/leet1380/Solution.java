package problem.leet1380;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new LinkedList<>();

        // i 控制的是第几行
        for (int[] ints : matrix) {
            // 记录该行的最小值
            int minNum = Integer.MAX_VALUE;
            // 记录该行最小值的下标
            int minIndex = 0;
            // 判断是否是 luckyNumber
            boolean isLuckyNum = true;
            // 遍历数组找出最小值和最小值下标
            for (int j = 0; j < matrix[0].length; j++) {
                if (minNum > ints[j]) {
                    minNum = ints[j];
                    minIndex = j;
                }
            }
            // 该行最小值的下标的那一列进行遍历，判断是否满足 luckyNumber
            for (int[] value : matrix) {
                if (minNum < value[minIndex]) {
                    isLuckyNum = false;
                    break;
                }
            }
            if (isLuckyNum) {
                list.add(minNum);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        List<Integer> list = luckyNumbers(arr);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
