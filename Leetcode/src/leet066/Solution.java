package leet066;

public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length == 0){
            return digits;
        }

        // 此时即代表数组中已经有元素

        // 将最后一位的元素加1
        digits[digits.length - 1] = digits[digits.length - 1] + 1;

        // 是否进位
        boolean isCarry = false;

        // 遍历判断进位
        for(int i = digits.length - 1;i>=0;i--){
            if(isCarry){
                digits[i] += 1;
                isCarry = false;
            }

            if(digits[i] >= 10){
                digits[i] %=  10;
                isCarry = true;
            }
        }
        if(isCarry){
            int[] ret = new int[digits.length + 1];
            ret[0] = 1;
            for(int i = 0;i<digits.length;i++){
                ret[i + 1] = digits[i];
            }

            return ret;
        }

        return digits;
    }
}
