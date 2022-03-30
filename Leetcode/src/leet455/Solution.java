package leet455;

import java.util.Arrays;

public class Solution {
    /*
    *   贪心算法： 把最小的饼干，依次拿给胃口最小的孩子吃，看是否能满足。
    * */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gIndex = 0;
        int sIndex = 0;
        int count = 0;
        while(sIndex < s.length){
            for (int i = gIndex; i < g.length; i++) {
                if (g[i] <= s[sIndex]){
                    count++;
                    gIndex = i + 1;
                    break;
                }
            }
            sIndex++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution  s= new Solution();
        int[] garr1 = {1,2,3};
        int[] sarr1 = {1,1};
        System.out.println(s.findContentChildren(garr1, sarr1));

        int[] garr2 = {1,2};
        int[] sarr2 = {1,2,3};
        System.out.println(s.findContentChildren(garr2, sarr2));

        int[] garr3 = {10,9,8,7};
        int[] sarr3 = {5,6,7,8};
        System.out.println(s.findContentChildren(garr3, sarr3));
    }
}
