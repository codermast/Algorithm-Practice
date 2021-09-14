package problem.leet202;

// https://leetcode-cn.com/problems/happy-number/

public class Solution {
    public boolean isHappy(int n) {
        int num = n;
        while(num > 4){
            int sum = 0;

            while(num > 9){
                sum += Math.pow(num%10,2);
                num /= 10;
            }
            sum += Math.pow(num,2);
            num = sum;
            continue;
        }

        if(num == 1){
            return true;
        }else{
            return false;
        }
    }
}
