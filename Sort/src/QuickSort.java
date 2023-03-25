import java.util.Arrays;

public class QuickSort {
    // 1.递归法
    public void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // 每次选取数组的第一个数
        int index = start;

        int left = index + 1;
        int right = end;
        while (left < right) {
            while (arr[right] > arr[index] && left < right) {
                right--;
            }

            while (arr[left] < arr[index] && left < right) {
                left++;
            }


            if (left < right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        if (left == right) {
            int tmp = arr[left];
            arr[left] = arr[index];
            arr[index] = tmp;
            index = left;
        }
        quickSort(arr, start, index - 1);
        quickSort(arr, index + 1, end);
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();

        int[] arr = {5, 4, 8, 1, 9, 7, 3, 2, 6, 0};
        sort.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
