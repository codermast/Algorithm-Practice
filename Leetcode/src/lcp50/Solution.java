package lcp50;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] gem = {3, 1, 2};

        int[][] operations = {
                {0, 2},
                {2, 1},
                {2, 0}
        };

        System.out.println(s.giveGem(gem, operations));
    }

    public int giveGem(int[] gem, int[][] operations) {
        for (int[] operation : operations) {
            int x = operation[0];
            int y = operation[1];
            int count = gem[x] / 2;

            gem[x] -= count;
            gem[y] += count;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : gem) {
            if (i < min) {
                min = i;
            }

            if (i > max) {
                max = i;
            }
        }
        return Math.abs(min - max);
    }
}