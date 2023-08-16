package leet2682;

import java.util.*;

public class Solution {

    public int[] circularGameLosers(int n, int k) {
        int[] arr = new int[n];
        arr[0] = 1;
        int i = 1;
        int index = 0;
        while (true) {
            index = (index + (i * k)) % n;
            arr[index] ++;
            i ++;
            if (arr[index] == 2){
                break;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0){
                list.add(j);
            }
        }
        Integer[] integers = list.toArray(new Integer[0]);

        int[]  ret = new int[integers.length];

        for (int j = 0; j < integers.length; j++) {
            ret[j] = integers[j] + 1;
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.circularGameLosers(5, 2)));
        System.out.println(Arrays.toString(s.circularGameLosers(4, 4)));
    }
}
