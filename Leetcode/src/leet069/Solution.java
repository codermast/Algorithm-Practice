package leet069;

public class Solution {
    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ret = 0;
        while(left < right){
            int middle = left + (right - left) / 2;
            if(middle * middle <= x){
                ret = middle;
                left = middle + 1;
            }else{
                right = middle;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(88));
    }
}
