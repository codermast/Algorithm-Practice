import java.util.Arrays;
/*
*   冒泡排序：基于交换的排序算法，稳定的排序算法
*       时间复杂度：O(n^2)
*       空间复杂度：O(1)
* */
public class BubbleSort{
    // 1.冒泡排序原始版本
    public int[] bubbleSortOne(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                // 每次循环将无序部分中最大的一个数，移到最终位置
                if (arr[j] < arr[j - 1]){
                    int tmp = arr[j -1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    // 2.冒泡排序优化版本
    // 时间复杂度：O(n^2)  空间复杂度:O(1)
    public int[] bubbleSortTwo(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean isSwap = false;
            for (int j = 1; j < arr.length - i; j++) {
                // 每次循环将无序部分中最大的一个数，移到最终位置
                if (arr[j] < arr[j - 1]){
                    int tmp = arr[j -1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                    isSwap = true;
                }
            }
            // 如果一整趟中，都没有发生交换，则说明已经排好序了。
            if (!isSwap){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] arr = { 5,4,8,1,9,7,3,2,6,0};
        System.out.println(Arrays.toString(sort.bubbleSortOne(arr)));
        System.out.println(Arrays.toString(sort.bubbleSortTwo(arr)));
    }
}
