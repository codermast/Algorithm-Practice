package leet303;

public class NumArray {
    int[] arr;

    public NumArray(int[] nums) {
        this.arr = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += this.arr[i];
        }
        return sum;
    }
}
