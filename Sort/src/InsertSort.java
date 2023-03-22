import java.util.Arrays;

/*
*   插入排序：
* */
public class InsertSort {
    public int[] insertSortOne(int[] arr){
        // i 指向当前需要排序的数 ，j 为已有序部分的索引
        for (int i = 1; i < arr.length; i++) {
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[index] < arr[j]){
                    int tmp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = tmp;
                    index--;
                }else {
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        int[] arr = { 5,4,8,1,9,7,3,2,6,0};
        System.out.println(Arrays.toString(sort.insertSortOne(arr)));
    }
}
