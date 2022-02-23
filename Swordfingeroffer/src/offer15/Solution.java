package offer15;

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


    /*
    *   位操作法
    * */
    public static int hammingWeight2(int n) {
        int count = 0;
        for(int i =0;i<32;i++){
            if((n & (1 << i)) != 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(-3));
        System.out.println(hammingWeight2(-3));
    }
}
