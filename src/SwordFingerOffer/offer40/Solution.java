package SwordFingerOffer.offer40;

import java.util.Arrays;
// https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/

/*
*   使用冒泡排序，然后进行数组的指定复制
* */
public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return Arrays.copyOfRange(arr, 0, k - 1);
    }
}
