package problem.leet1323;

public class Solution {
    public int maximum69Number(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        for (int i = 0; i < sb.length(); i++) {
            int c = sb.charAt(i) - 48;
            if (c == 6) {
                sb.replace(i, i + 1, "9");
            }
        }
        return Integer.parseInt(String.valueOf(sb));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.maximum69Number(9969);
    }
}
