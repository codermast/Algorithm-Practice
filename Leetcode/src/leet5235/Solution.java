package leet5235;

import java.util.*;

public class Solution {
    static class Node {
        int winCount = 0;
        int loserCount = 0;
    }

    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Node> map = new HashMap<>();

        for (int[] match : matches) {
            int winId = match[0];
            int loserId = match[1];

            // 更新胜利的人的 node
            if (map.containsKey(winId)) {
                Node winNode = map.get(winId);
                winNode.winCount++;
                map.put(winId, winNode);
            } else {
                Node winNode = new Node();
                winNode.winCount++;
                map.put(winId, winNode);
            }

            // 更新失败的人的 node
            if (map.containsKey(loserId)) {
                Node loserNode = map.get(loserId);
                loserNode.loserCount++;
                map.put(loserId, loserNode);
            } else {
                Node loserNode = new Node();
                loserNode.loserCount++;
                map.put(loserId, loserNode);
            }
        }

        List<List<Integer>> ret = new LinkedList<>();

        List<Integer> noLoser = new LinkedList<>();
        List<Integer> oneLoser = new LinkedList<>();

        for (Map.Entry<Integer, Node> integerNodeEntry : map.entrySet()) {
            if (integerNodeEntry.getValue().loserCount == 0) {
                noLoser.add(integerNodeEntry.getKey());
            } else if (integerNodeEntry.getValue().loserCount == 1) {
                oneLoser.add(integerNodeEntry.getKey());
            }
        }
        Collections.sort(noLoser);
        Collections.sort(oneLoser);
        ret.add(noLoser);
        ret.add(oneLoser);
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = {{1, 3},{2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        System.out.println(s.findWinners(arr));
    }
}
