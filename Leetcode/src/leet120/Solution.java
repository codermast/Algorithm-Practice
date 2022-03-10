package leet120;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }

        // 初始化 dp 列表
        List<List<Integer>> dp = new LinkedList<>();
        dp.add(triangle.get(0));

        // 开始从第二行遍历
        for (int i = 1; i < triangle.size(); i++) {
            // 记录前一行dp的列表
            List<Integer> dpPre = dp.get(i - 1);
            // 当前列表
            List<Integer> listCur = triangle.get(i);
            // 记录 dp 的列表
            List<Integer> dplist = new LinkedList<>();


            // 遍历当前列表
            for (int j = 0; j < listCur.size(); j++) {
                // 如果为最左边的元素，则 dp 值为 ： 当前值 + 前一行的 dp列表的第一个值
                if (j == 0) {
                    dplist.add(listCur.get(0) + dpPre.get(0));
                    // 如果为最后一个元素，则 dp 值为： 当前值 + 前一行该索引最后一位的值
                } else if (j == listCur.size() - 1) {
                    dplist.add(listCur.get(j) + dpPre.get(dpPre.size() - 1));
                    // 否则：dp 值为：当前值 + Math.min(前一行的dp该位置的值，前一行的dp该位置之前一个索引的值);
                } else {
                    dplist.add(listCur.get(j) + Math.min(dpPre.get(j), dpPre.get(j - 1)));
                }
            }
            dp.add(dplist);
        }

        List<Integer> list = dp.get(dp.size() - 1);
        int min = list.get(0);

        for (Integer integer : list) {
            if (min > integer) {
                min = integer;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = {{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}};
        List<List<Integer>> list = new LinkedList<>();
        for (int[] ints : arr) {
            List<Integer> intslist = new LinkedList<>();
            for (int anInt : ints) {
                intslist.add(anInt);
            }
            list.add(intslist);
        }
        System.out.println(s.minimumTotal(list));
    }
}
