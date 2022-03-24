package leet661;

public class Solution {
    public int[][] imageSmoother(int[][] img) {
        int i = 0;
        int j = 0;

        int[][] ret = new int[img.length][img[0].length];

        while (i < img.length && j < img[0].length) {
            int sum = 0;
            int count = 0;
            // 左上
            if (isIndexTrue(i - 1, j - 1, img)) {
                sum += img[i - 1][j - 1];
                count++;
            }
            // 正上
            if (isIndexTrue(i - 1, j, img)) {
                sum += img[i - 1][j];
                count++;

            }
            // 右上
            if (isIndexTrue(i - 1, j + 1, img)) {
                sum += img[i - 1][j + 1];
                count++;

            }
            // 左
            if (isIndexTrue(i, j - 1, img)) {
                sum += img[i][j - 1];
                count++;
            }
            // 中
            if (isIndexTrue(i, j, img)) {
                sum += img[i][j];
                count++;
            }
            // 右
            if (isIndexTrue(i, j + 1, img)) {
                sum += img[i][j + 1];
                count++;
            }
            // 左下
            if (isIndexTrue(i + 1, j - 1, img)) {
                sum += img[i + 1][j - 1];
                count++;
            }
            // 下
            if (isIndexTrue(i + 1, j, img)) {
                sum += img[i + 1][j];
                count++;
            }
            // 右下
            if (isIndexTrue(i + 1, j + 1, img)) {
                sum += img[i + 1][j + 1];
                count++;
            }
            ret[i][j] = sum / count;
            j++;
            if (j % img[0].length == 0) {
                j = 0;
                i++;
            }
        }
        return ret;
    }

    // 判断数组索引是否合法
    private boolean isIndexTrue(int i, int j, int[][] img) {
        if (img.length == 0) {
            return false;
        }

        if (img[0].length == 0) {
            return false;
        }
        return i >= 0 && i <= img.length - 1 && j >= 0 && j <= img[0].length - 1;
    }
}
