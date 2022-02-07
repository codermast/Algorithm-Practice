package problem.leet258;

public class Solution {
//    public int addDigits(int num)
//    {
//        return (num - 1) % 9 + 1;
//    }

    public int addDigits(int num) {
        if(num < 10){
            return num;
        }

        while(num > 9){
            int n = num;
            int sum = 0;
            while(n > 0){
                int rem = n % 10;
                sum += rem;
                n /= 10;
            }
            num = sum;
        }
        return num;
    }
}
