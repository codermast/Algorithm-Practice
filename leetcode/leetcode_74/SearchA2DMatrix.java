package leetcode_74;

public class SearchA2DMatrix {

    // 暴力匹配
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // 查找优化
    public boolean searchMatrix1(int[][] matrix, int target) {
        // 行数
        int rowNum = matrix.length;
        // 列数
        int colNum = matrix[0].length;

        for (int i = 0; i < rowNum; i++) {
            if (matrix[i][colNum - 1] > target) {
                return binarySearch(matrix[i], target);
            } else if (matrix[i][colNum - 1] == target) {
                return true;
            }
        }
        return false;
    }

    // 二分查找
    public boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (arr[middle] == target) {
                return true;
            } else if (arr[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }
}
