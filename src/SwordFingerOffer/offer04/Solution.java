package SwordFingerOffer.offer04;

public class Solution {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int m = matrix.length;
        int n;
        if(m>0) {
            n = matrix[m - 1].length;
            if(n>0){
                for(int i = 0;i<m;i++){
                    if(matrix[i][n-1] >= target){
                        if (binarySearch(matrix[i],target)){
                            return binarySearch(matrix[i],target);
                        }
                    }
                }

            }
        }
        return false;
    }


    /*
    *   二分查找
    * */
    public static boolean binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int middle = (right - left) / 2 + left;
            if(arr[middle] > target){
                right = middle;
            }else if (arr[middle] < target){
                left = middle + 1;
            }else{
                return true;
            }
        }
        if(arr[left] == target){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        int[][] arr = {
//                {1,4,7,11,15},
//                {2,5,8,12,19},
//                {3,6,9,16,22},
//                {10,13,14,17,23},
//                {15,18,21,23,26}
//        };

        int[][] arr = {{-5}};
        System.out.println(findNumberIn2DArray(arr, -5));
//        System.out.println(findNumberIn2DArray(arr, 6));
//        System.out.println(findNumberIn2DArray(arr, 7));
//        System.out.println(findNumberIn2DArray(arr, 28));
    }
}
