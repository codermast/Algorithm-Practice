import java.util.Arrays;
/*
*   选择排序：基于交换的排序算法，不稳定的排序算法
*       时间复杂度 O(n^2)
*       空间复杂度O(1)
* */
public class SelectSort {
    // 1.选择排序
    public int[] selectSortOne(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectSort sort = new SelectSort();
        int[] arr = { 5,4,8,1,9,7,3,2,6,0};
        System.out.println(Arrays.toString(sort.selectSortOne(arr)));
        System.out.println(Arrays.toString(sort.selectSortOne(arr)));
    }
}
