package problem.leet509;

public class Solution {
    // 斐波那契数列：递归法
    public int fib(int n) {
        if(n < 2){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
