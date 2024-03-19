# 华为OD机试题 - 射击比赛

## 输入

- 第一行：一个整数 N，表示该场比赛总共进行了 N 次射击，2 <= N <= 100。
- 第二行：一个长度为 N 的整数序列，表示参与本次射击的选手 ID，0 <= ID <= 99。
- 第三行：一个长度为 N 的整数序列，表示参与每次射击的选手对应的成绩，0 <= 成绩 <= 100。

## 输出

符合题设条件的降序排名后的选手 ID 序列。

## 示例

### 输入示例

```
13
3,3,7,4,4,4,4,7,7,3,5,5,5
53,80,68,24,39,76,66,16,100,55,53,80,55
```

### 输出示例

```
5,3,7,4
```

## 解题思路

1. 读取输入数据，包括 N，所有射击的 ID 和成绩。
2. 将每个射击的 ID 和成绩保存在一个 HashMap 中。
3. 遍历 HashMap，对于每个射击，如果其成绩数量大于等于 3，则将其最高的三个成绩相加并保存在一个 List 中。
4. 将所有满足条件的射击以及他们的成绩之和保存在一个 List<List>中。
5. 对所有满足条件的射击按照成绩之和从大到小排序。如果有多个射击成绩之和相同，按照 ID 从小到大排序。
6. 将排名靠前的射击的 ID 按照从小到大的顺序输出，射击 ID 之间用逗号隔开。
7. 程序会捕获输入错误的异常并输出"input error"。

## 题解

```java
import java.util.*;

public class Main {

    static class Node {
        Integer id;
        List<Integer> list;
        Integer sum;

        public Node(Integer id, Integer score) {
            this.id = id;
            this.list = new ArrayList<>();
            this.list.add(score);
            this.sum = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] ids = scanner.nextLine().split(",");
        String[] scores = scanner.nextLine().split(",");

        // 判断输入信息是否符合要求
        if (n < 2 || n > 100) {
            System.out.println("input error");
            return;
        }

        if (ids.length != n || scores.length != n) {
            System.out.println("input error");
            return;
        }

        // 遍历选手的信息，并存储到 map
        Map<Integer, Node> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int id = Integer.parseInt(ids[i]);
            int score = Integer.parseInt(scores[i]);
            if (map.containsKey(id)) {
                Node node = map.get(id);
                node.list.add(score);
            } else {
                Node node = new Node(id, score);
                map.put(id, node);
            }
        }

        // 将符合要求的选手信息装进 list 中存储，方便排序
        List<Node> list = new ArrayList<>();
        // 遍历 map 集合，并且进行条件筛选
        for (Map.Entry<Integer, Node> entry : map.entrySet()) {
            Integer id = entry.getKey();
            Node node = entry.getValue();

            if (node.list.size() < 3) {
                map.remove(id);
            } else {
                node.list.sort(Comparator.comparingInt(o -> o));
                for (int i = 0; i < 3; i++) {
                    node.sum += node.list.get(i);
                }
                list.add(node);
            }
        }
        // 排序 list
        list.sort(((o1, o2) -> {
            if (!Objects.equals(o1.sum, o2.sum)) {
                return o2.sum - o1.sum;
            } else {

                return o2.id - o1.id;
            }
        }));

        // 拼接输出字符串
        StringBuilder sb = new StringBuilder();

        for (Node node : list) {
            sb.append(node.id);
            sb.append(",");
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}
```