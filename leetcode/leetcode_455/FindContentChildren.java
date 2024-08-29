package leetcode_455;

import java.util.Arrays;

public class FindContentChildren {
    // 解题思路：用最大的饼干去满足尽可能大胃口的孩子，以避免饼干尺寸的浪费
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int num = 0;

        // 控制饼干的下标
        int index = s.length - 1;

        // 控制孩子
        for (int i = g.length - 1; i >= 0; i--) {
            if (index >= 0 && s[index] >= g[i]){
                num++;
                index--;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        FindContentChildren instance = new FindContentChildren();

        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        System.out.println(instance.findContentChildren(g, s));
    }
}
