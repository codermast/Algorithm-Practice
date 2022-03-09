# Leetcode 6.Z字形变换 - 简单模拟法操作

## 题目地址

[https://leetcode-cn.com/problems/zigzag-conversion/](https://leetcode-cn.com/problems/zigzag-conversion/)

## 解题思路

&emsp;&emsp;通过题目描述，很显然的能发现两个规律：

- 当变换到第一行时，此时需要开始向下走；
- 当变换到最后一行时，此时需要斜向上走；

&emsp;&emsp;题目中也就这两个规律，通过对字符串的一次遍历，即可完成.

## 代码

```java
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
}
```