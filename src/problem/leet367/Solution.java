package problem.leet367;

public class Solution {
    /*
    *   使用内置库函数
    * */
    public boolean isPerfectSquare(int num) {
        int s = (int)Math.sqrt(num);
        return s * s == num;
    }
}
