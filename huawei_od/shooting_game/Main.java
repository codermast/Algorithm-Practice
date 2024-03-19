package shooting_game;

import java.util.*;

public class Main {

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
}
