# 华为OD机试题 - 最远足迹

## 题目

**题目**
某探险队负责对地下洞穴进行探险。探险队成员在进行探险任务时，随身携带的记录器会不定期地记录自身的坐标，但在记录的间隙中也会记录其他数据。探索工作结束后，探险队需要获取到某成员在探险过程中相对于探险队总部的最远的足迹位置。

仪器记录坐标时，坐标的数据格式为(x,y)，如(1,2)、(100,200)，其中 0<x<1000，0<y<1000。同时存在非法坐标，如(01,1)、(1,01)，(0,100)
属于非法坐标。
设定探险队总部的坐标为(0,0)，某位置相对总部的距离为：xx+yy。
若两个座标的相对总部的距离相同，则第一次到达的坐标为最远的足迹。
若记录仪中的坐标都不合法，输出总部坐标（0,0）。

**备注：**
不需要考虑双层括号嵌套的情况，比如 sfsdfsd((1,2))。

**输入描述**
字符串，表示记录仪中的数据。

如：

ferga13fdsf3(100,200)f2r3rfasf(300,400)

**输出描述**
字符串，表示最远足迹到达的坐标。

如：

(300,400)

**示例 1**
输入输出示例仅供调试，后台判题数据一般不包含示例

输入

```
ferg(3,10)a13fdsf3(3,4)f2r3rfasf(5,10)
```

输出

```
(5,10)
```

说明

记录仪中的合法坐标有 3 个： (3,10)， (3,4)， (5,10)，其中(5,10)是相距总部最远的坐标， 输出(5,10)。

**示例 2**
输入输出示例仅供调试，后台判题数据一般不包含示例

输入

```
asfefaweawfaw(0,1)fe
```

输出

```
(0,0)
```

说明
记录仪中的坐标都不合法，输出总部坐标（0,0）。

**解题思路**

- 创建 Scanner 对象并读入一行输入。
- 检查输入字符串是否为空或长度小于 1，如果是，则输出错误信息并退出程序。
- 定义 solve() 方法，该方法用于解决问题。在方法中，定义两个变量 right 和 left，以及两个 List 集合 myList 和 allLists。
- 遍历输入字符串的每个字符，如果该字符是左括号，则将 left 设置为当前下标加一；如果该字符是右括号，则将 right 设置为当前下标。
- 如果 right 不等于 0，则说明找到了一组符合条件的数对，对其进行处理，并将其添加到 myList 中，然后将 myList 添加到 allLists
  中。然后将 left 和 right 重置为 0。
- 如果 allLists 集合中有元素，则对其中的所有元素按照其平方和大小进行排序，并输出第一个元素。
- 如果 allLists 集合中没有元素，则输出默认值 “(0,0)”。
- 在 main() 方法中调用 solve() 方法来解决问题。

本程序主要使用了以下集合和知识点：

- Scanner 类：用于从标准输入流中读取用户输入。
- List 集合：用于存储符合条件的数对和所有数对。程序中使用 ArrayList 实现 List。
- 字符串操作：用于截取子串和分割字符串。程序中使用 String.substring() 和 String.split() 方法。
- Lambda 表达式：用于对集合中的元素进行排序。程序中使用 Collections.sort() 方法和 Lambda 表达式。
- 异常处理：用 try-catch 语句捕获可能出现的异常并输出错误信息。

## 题解

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> coordinateList = new ArrayList<>();
        int left = 0, right = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left = i;
            } else if (c == ')') {
                right = i;
                coordinateList.add(s.substring(left, right + 1));
            }
        }

        for (int i = 0; i < coordinateList.size(); i++) {
            String string = coordinateList.get(i);
            String[] split = string.substring(1, string.length() - 1).split(",");
            int numLeft = Integer.parseInt(split[0]);
            int numRight = Integer.parseInt(split[1]);

            if ((numLeft >= 1000 || numLeft <= 0 || numRight >= 1000 || numRight <= 0)) {
                coordinateList.remove(i);
            }
        }

        coordinateList.sort((o1, o2) -> {
            String[] o1Split = o1.substring(1, o1.length() - 1).split(",");
            String[] o2Split = o2.substring(1, o2.length() - 1).split(",");
            int o1NumLeft = Integer.parseInt(o1Split[0]);
            int o1NumRight = Integer.parseInt(o1Split[1]);

            int o2NumLeft = Integer.parseInt(o2Split[0]);
            int o2NumRight = Integer.parseInt(o2Split[1]);

            int o1Sum = o1NumLeft * o1NumLeft + o1NumRight * o1NumRight;
            int o2Sum = o2NumLeft * o2NumLeft + o2NumRight * o2NumRight;

            return o2Sum - o1Sum;
        });

        if (!coordinateList.isEmpty()) {
            System.out.println(coordinateList.get(0));
        } else {
            System.out.println("(0,0)");
        }
    }
}
```