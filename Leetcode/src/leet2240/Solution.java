package leet2240;

public class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ret = 0;

        int maxOne = total / cost1;

        for (int i = 0; i <= maxOne; i++) {
            int sub = total - (cost1 * i);

            ret += sub / cost2 + 1;
        }

        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.waysToBuyPensPencils(20, 10, 5));
        System.out.println(s.waysToBuyPensPencils(5, 10, 10));
        System.out.println(s.waysToBuyPensPencils(20, 5, 10));
    }
}
