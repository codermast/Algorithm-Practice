# 华为OD机试题 - 字符串序列判定

## 题目

**题目**

输入两个字符串 S 和 L，都只包含英文小写字母。S 长度<=100，L 长度<=500,000。

判定 S 是否是 L 的有效子串。

**判定规则：**

S 中的每个字符在 L 中都能找到（可以不连续），且 S 在Ｌ中字符的前后顺序与 S 中顺序要保持一致。

（例如，S=”ace”是 L=”abcde”的一个子序列且有效字符是 a、c、e，而”aec”不是有效子序列，且有效字符只有 a、e）

**输入描述**

输入两个字符串 S 和 L，都只包含英文小写字母。S 长度<=100，L 长度<=500,000。
先输入 S，再输入 L，每个字符串占一行。

**输出描述:**

S 串最后一个有效字符在 L 中的位置。（首位从 0 开始计算，无有效字符返回-1）

**示例一**
输入

```shell
ace
abcde
```

输出

```
4
```

**示例二**
输入

```shell
fgh
abcde
```

输出

```
-1
```

## 题解

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String l = scanner.nextLine();

        int i = 0, j = 0;

        while (j < l.length() && i < s.length()) {
            char sch = s.charAt(i);
            char lch = l.charAt(j);

            if (sch == lch) {
                i++;
            }
            j++;
        }
        if (i == s.length()) {
            System.out.println(j - 1);
        } else {
            System.out.println(-1);
        }
    }
}
```