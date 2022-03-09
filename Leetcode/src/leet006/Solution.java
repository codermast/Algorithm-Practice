package leet006;

public class Solution {
    public String convert(String s, int numRows) {
        // 当只有一行时，变换后的字符串和原来的字符串是相等的
        if (numRows == 1 || s.length() < numRows) {
            return s;
        }

        // 此时为不为 1 的情况
        int i = 0;  // 控制行数
        int j = 0;  // 控制列数

        // 用来模拟的数组
        char[][] arr = new char[numRows][s.length()];

        Each_String:
        for (int k = 0; k < s.length(); ) {
            // 为第一行的时候，即开始向下走
            if (i == 0) {
                // 走到不是最后一行时，退出循环的时候，i == (numRows - 1)
                while (i != numRows - 1) {
                    if (k < s.length()) {
                        arr[i][j] = s.charAt(k);
                    } else {
                        break Each_String;
                    }
                    k++;
                    i++;
                }
            }

            // 最后一行时
            if (i == numRows - 1) {
                // 开始需要斜向上走
                while (i != 0) {
                    if (k < s.length()) {
                        arr[i][j] = s.charAt(k);
                    } else {
                        break Each_String;
                    }
                    k++;
                    i--;
                    j++;
                }
            }
        }
        StringBuilder ret = new StringBuilder();
        for (char[] chars : arr) {
            for (char aChar : chars) {
                if (aChar != 0) {
                    ret.append(aChar);
                }
            }
        }
        return ret.toString();
    }

    // 测试用例
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.convert("PAYPALISHIRING", 4));
    }
}
