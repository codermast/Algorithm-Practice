package leet008;

public class Solution {
    public int myAtoi(String s) {
        int index = 0;
        StringBuilder ret = new StringBuilder();

        // 1. 去除前导空格
        while (index < s.length()) {
            if (s.charAt(index) == ' ') {
                index++;
            } else {
                break;
            }
        }

        boolean isAddSymbol = false;    // 符号
        boolean isAddNum = false;
        while (index < s.length()) {
            // 2.检查当前字符是否为符号

            // 检测到符号位时
            if (s.charAt(index) == '+' || s.charAt(index) == '-') {
                // 如果没加符号，则加上符号即可
                if (!isAddSymbol) {
                    ret.append(s.charAt(index));
                    index++;
                    isAddSymbol = true;
                } else {
                    // 如果加上了符号位，还检测到符号位则返回 0
                    return 0;
                }

                if (isAddNum){
                    return 0;
                }
            } else if (s.charAt(index) >= 48 && s.charAt(index) <= 57) {
                // 检测到数字时
                ret.append(s.charAt(index));
                isAddNum = true;
                index++;
            } else {
                // 检测到其他时
                // 检测到其他，并且已经添加过数字，则直接返回已经记录的数字
                if (isAddNum) {
                    break;
                }

                // 没加过符号，出现字母，则循环继续
                if (!isAddSymbol) {
                    return 0;
                }
            }
        }

        if (ret.length() == 0) {
            return 0;
        }

        if (ret.length() == 1) {
            if (ret.charAt(0) == '-' || ret.charAt(0) == '+') {
                return 0;
            }
        }

        // 判断 ret 结果是否合法
        long retNum;
        try {
            retNum = Long.parseLong(ret.toString());
        } catch (Exception e) {
            if (s.length() > 0) {
                if (s.charAt(0) == '-') {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            } else {
                return 0;
            }

        }

        if (retNum > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (retNum < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) retNum;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.myAtoi("20000000000000000000") + "==" + 2147483647);
        System.out.println(s.myAtoi("4193 with words") + "==" + 4193);
        System.out.println(s.myAtoi("42") + "==" + 42);
        System.out.println(s.myAtoi("-42") + "==" + -42);
        System.out.println(s.myAtoi("  42") + "==" + 42);
        System.out.println(s.myAtoi("asd -42") + "==" + -42);
        System.out.println(s.myAtoi("+-42") + "==" + 0);
        System.out.println(s.myAtoi("") + "==" + 0);
        System.out.println(s.myAtoi(" ") + "==" + 0);
        System.out.println(s.myAtoi("100000000000000000000000") + "==" + 2147483647);
    }
}
