package leet231;

public class Solution {
    // 迭代法
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        long num = 1;
        while (num <= n) {
            if (num == n) {
                return true;
            } else {
                num *= 2;
            }
        }
        return false;
    }

    // 递归法 : 栈溢出的可能
    public boolean isPowerOfTwo2(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo2(n / 2);
    }

    // 判断二进制中 1 的个数的方法
    public boolean isPowerOfTwo3(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}