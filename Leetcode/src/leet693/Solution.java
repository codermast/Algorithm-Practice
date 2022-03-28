package leet693;

public class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean isTrue;
        isTrue = (n & 1) == 1;
        while (n != 0) {
            if (isTrue && (n & 1) == 1) {
                isTrue = false;
                n >>= 1;
            }else if (!isTrue && (n & 1) == 0){
                isTrue = true;
                n >>= 1;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.hasAlternatingBits(5));
        System.out.println(s.hasAlternatingBits(7));
        System.out.println(s.hasAlternatingBits(10));
        System.out.println(s.hasAlternatingBits(11));
    }
}
