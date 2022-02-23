package leet009;

// https://leetcode-cn.com/problems/palindrome-number/

public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || ( x % 10 == 0 && x != 0)){
            return false;
        }

        int revert = 0;
        while(x > revert){
            revert = (x % 10) + revert * 10;
            x /= 10;
        }
        return x == revert || x == revert / 10;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.isPalindrome(121));
    }
}
