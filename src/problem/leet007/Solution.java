package problem.leet007;

import java.util.Stack;

public class Solution {
    public int reverse(int x) {
        if(x == 0){
            return 0;
        }

        int num = (int)abs(x);
        int sum = -1;
        Stack<Integer> stack = new Stack<>();

        int count = 0;
        while(num>9){
            stack.push(num % 10);
            num /= 10;
        }
        stack.push(num);
        while(!stack.empty()){
            int target = stack.pop();
            sum += target * Math.pow(10,count);
            count ++;
        }
        if(abs(sum) < 2147483647){
            if(x<0){
                return -(sum + 1);
            }
            return sum + 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverse(-2147483648));
    }

    public static long abs(long num){
        if(num < 0){
            return -num;
        }
        return num;
    }
}
