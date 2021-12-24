package problem.leet367;

public class Solution {
    /*
    *   使用内置库函数
    * */
    public boolean isPerfectSquare(int num) {
        int s = (int)Math.sqrt(num);
        return s * s == num;
    }

    /*
    *   不使用内置库函数
    * */
    public boolean isPerfectSquareUnuseSquare(int num){
        long i = 0;
        long product = 0;
        while(product <= num){
            if(product== num){
                return true;
            }
            i++;
            product= i *i;
        }
        return false;
    }
}
