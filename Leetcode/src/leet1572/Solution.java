package leet1572;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        int i = 0;
        int j = 0;

        while (i < mat.length && j < mat.length){
            sum += mat[i][j];
            sum += mat[i][mat.length - j - 1];
            i++;
            j++;
        }

        if (mat.length % 2 != 0){
            int index = mat.length / 2;
            sum -= mat[index][index];
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(s.diagonalSum(arr));
    }
}
