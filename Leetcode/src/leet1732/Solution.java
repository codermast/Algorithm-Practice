package leet1732;

public class Solution {
    public static int largestAltitude(int[] gain) {
        int[] high = new int[gain.length + 1];
        int highmax = 0;

        high[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            high[i + 1] = high[i] + gain[i];
            if (highmax  < high[i + 1]){
                highmax = high[i + 1];
            }
        }
        return highmax;
    }

    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        int[] arr2 = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
        System.out.println(largestAltitude(arr2));
    }
}
