package leet832;

import java.util.Arrays;

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        if (image.length == 0) {
            return image;
        }
        int[][] ret = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j] == 1){
                    ret[i][image[0].length - 1 - j] = 0;
                }else{
                    ret[i][image[0].length - 1 - j] = 1;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = {{1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}};
        int[][] ret = s.flipAndInvertImage(arr);
        System.out.println("=====arr======");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("=====ret======");
        for (int[] ints : ret) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
