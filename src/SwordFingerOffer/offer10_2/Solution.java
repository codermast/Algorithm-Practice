package SwordFingerOffer.offer10_2;

public class Solution {
    /*
    *   本质上仍是斐波那契数列，只不过首项从1开始
    * */
    public int numWays(int n) {
        if(n < 2){
            return 1;
        }

        int fib1 = 1;
        int fib2 = 1;
        int fib = fib1 + fib2;
        int num = 0;

        while(num<n-1){
            fib = (fib1 + fib2) % 1000000007;
            fib1 = fib2;
            fib2 = fib;
            num ++ ;
        }
            return fib;
    }
}
