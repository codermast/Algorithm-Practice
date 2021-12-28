package problem.leet1137;

public class Solution {

    /*
    *   动态规划
    * */
    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int p = 0, q = 0, r = 1, s = 1;
        for (int i = 3; i <= n; ++i) {
            p = q;
            q = r;
            r = s;
            s = p + q + r;
        }
        return s;
    }

    /*
     *   递归法
     * */
    public static int tribonacci2(int n) {
        if(n< 2 ){
            return n;
        }
        if(n == 2){
            return 1;
        }
        return tribonacci2(n-3) + tribonacci2(n-2) + tribonacci2(n-1);
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(1));
        System.out.println(tribonacci(4));
        System.out.println(tribonacci(12));
        System.out.println(tribonacci(13));
        System.out.println(tribonacci(25));
    }
}
