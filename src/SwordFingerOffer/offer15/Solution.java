package SwordFingerOffer.offer15;

public class Solution {
    // you need to treat n as an unsigned value

    /*
    *   在java中不存在无符号数
    * */
    public static int hammingWeight(int n) {
        int count = 0;

        int num = n;
        while(num != 0){
            if(num % 2 == 1 || num % 2 == -1){
                count++;
            }
            num = num >>> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(-3));
    }
}
