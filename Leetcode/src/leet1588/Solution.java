package leet1588;

public class Solution {
    public static int sumOddLengthSubarrays(int[] arr) {
        // 返回值
        int ret = 0;
        // 步长
        int arrlen = 1;

        // 步长 <= 数组长度时即可开始循环
        while(arrlen <= arr.length){
            // 左索引
            int leftIndex = 0;
            // 右索引
            int rightIndex = leftIndex + arrlen;
            // 只有当右索引小于数组长度时
            while (rightIndex < arr.length) {
                int sum = 0;

                for (int i = leftIndex; i < rightIndex; i++) {
                    sum += arr[i];
                }
                ret += sum;

                leftIndex ++;
                rightIndex ++;
            }

            arrlen += 2;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[]{1,4,2,5,3}));
    }
}
