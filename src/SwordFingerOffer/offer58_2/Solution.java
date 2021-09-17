package SwordFingerOffer.offer58_2;

// https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
public class Solution {
    public String reverseLeftWords(String s, int n) {
        String str1 = s.substring(0,n);
        String str2 = s.substring(n);
        return str2 + str1;
    }
}
