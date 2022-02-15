package problem.leet1380;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new LinkedList<>();

        // i 控制第几行
        for(int i = 0;i<matrix.length;i++){
            // 一行的最小值
            int minNum = Integer.MAX_VALUE;
            int minIndex = 0;
            // j 控制第几列
            for (int j = 0;j<matrix[0].length;j++){
                if(minNum > matrix[i][j]){
                    minNum = matrix[i][j];
                    minIndex = j;
                }
            }

            for (int k = 0;k<matrix.length;k++){
                if (minNum < matrix[k][minIndex]){
                    break;
                }
            }

            list.add();
        }
    }
}
