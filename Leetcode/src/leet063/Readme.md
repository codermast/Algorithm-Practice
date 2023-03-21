# Leetcode 63. 不同路径 II 动态规划处理63.不同路径问题（障碍版）
## 题目描述
一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish”）。

现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？

网格中的障碍物和空位置分别用 1 和 0 来表示。

 

示例 1：


输入：obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
输出：2
解释：3x3 网格的正中间有一个障碍物。
从左上角到右下角一共有 2 条不同的路径：
1. 向右 -> 向右 -> 向下 -> 向下
2. 向下 -> 向下 -> 向右 -> 向右
   示例 2：


输入：obstacleGrid = [[0,1],[0,0]]
输出：1
 

提示：

m == obstacleGrid.length
n == obstacleGrid[i].length
1 <= m, n <= 100
obstacleGrid[i][j] 为 0 或 1

## 题解地址

[Leetcode 63. 不同路径 II](https://leetcode.cn/problems/unique-paths-ii/solution/dong-tai-gui-hua-chu-li-63bu-tong-lu-jin-45zm/)

## 解题思路
> 此题为Leetcode 62.不同路径 问题的升级版，虽然升级版，但是其实现原理类似，题62的解法详情请移步[Leetcode 62.不同路径](https://leetcode.cn/problems/unique-paths/solution/dong-tai-gui-hua-dpmiao-jie-bu-tong-lu-j-61ut/)，这里不做过多赘述。

1. 首先我们分析题意，将从左上角出发，到达右下角，则首先可以判断，如若此两个位置都有障碍，则必然无法到达。
2. 障碍位置使用1代替，此时我们的动态规划数组中到达方格的路径数为1时，两者出现歧义，故此将有障碍并且查看过的位置改为-1，表示我们已经查看过该位置的路径到达数量为-1，便于我们的识别。
3. 判断其方格的上方和左方位置是否存在和是否有障碍物，则此时可以计算出当前位置的路径数量。
4. 故此循环到最后一个位置，即可得出答案。

## 代码示例

```java
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int i_len = obstacleGrid.length;
        int j_len = obstacleGrid[0].length;
        // 左上角和右下角有障碍时，则无法通过
        if (obstacleGrid[0][0] == 1 || obstacleGrid[i_len - 1][j_len - 1] == 1){
            return 0;
        }

        obstacleGrid[0][0] = 1;
        int i = 0;
        int j = 0;

        while (i < i_len && j < j_len){
            int left = 0;
            int up = 0;

            // 此时必然有上和左
            if (i != 0 && j != 0){
                // 为障碍物时
                if (obstacleGrid[i][j] == 1){
                    // 改为 -1 代表已经操作过
                    obstacleGrid[i][j] = -1;
                }else {
                    left = obstacleGrid[i][j - 1];
                    up = obstacleGrid[i - 1][j];

                    if (left != -1){
                        obstacleGrid[i][j] += left;
                    }

                    if (up != -1){
                        obstacleGrid[i][j] += up;
                    }
                }
            }
            // 此时仅有上
            if (i != 0 && j == 0){
                // 为障碍物时
                if (obstacleGrid[i][j] == 1){
                    // 改为 -1 代表已经操作过
                    obstacleGrid[i][j] = -1;
                }else {
                    up = obstacleGrid[i - 1][j];
                    if (up != -1){
                        obstacleGrid[i][j] += up;
                    }
                }
            }

            // 此时仅有左
            if (i == 0 && j != 0){
                // 为障碍物时
                if (obstacleGrid[i][j] == 1){
                    // 改为 -1 代表已经操作过
                    obstacleGrid[i][j] = -1;
                }else {
                    left = obstacleGrid[i][j - 1];

                    if (left != -1){
                        obstacleGrid[i][j] += left;
                    }
                }
            }

            j++;
            if (j % j_len == 0){
                j = 0;
                i ++;
            }
        }
        return obstacleGrid[i_len - 1][j_len - 1];
    }
}
```