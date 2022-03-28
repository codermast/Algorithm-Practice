package leet231;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        long num = 1;
        while (num <= n){
            if(num == n){
                return true;
            }else{
                num *= 2;
            }
        }
        return false;
    }
}