package offer10_1;

public class Solution {
    /*
     *   递归实现
     *   缺点：当数字较大时存在栈溢出
     * */
    public int fib(int n) {
        if(n<2){
            return n;
        }
        return fib(n-1) + fib(n - 2);
    }


    /*
     *   循环法
     * */
    public int fibfun(int n) {
        if(n < 2){
            return n;
        }
        int fib1 = 0;
        int fib2 = 1;
        int fib = fib1 + fib2;;
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
