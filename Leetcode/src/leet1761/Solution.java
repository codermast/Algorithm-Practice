package leet1761;

public class Solution {

    public int minTrioDegree(int n, int[][] edges) {
        // 1. 创建图的邻接矩阵
        int[][] arr = new int[n][n];
        // 2. 创建节点的度数组
        int[] nodeDegree = new int[n];
        // 3. 创建结果
        int ret = Integer.MAX_VALUE;

        // 4. 将边加入邻接矩阵

        for (int[] edge : edges) {
            int a = edge[0] - 1;
            int b = edge[1] - 1;

            arr[a][b] = 1;
            arr[b][a] = 1;

            nodeDegree[a]++;
            nodeDegree[b]++;
        }


        // 5. 枚举所有的三元组
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    // 符合条件即为三元组
                    if (arr[i][j] == 1 && arr[i][k] == 1 && arr[j][k] == 1) {
                        ret = Math.min(nodeDegree[i] + nodeDegree[j] + nodeDegree[k] - 6, ret);
                    }
                }
            }
        }

        // 6. 判断结果是否合法
        if (ret == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ret;
        }
    }
}
