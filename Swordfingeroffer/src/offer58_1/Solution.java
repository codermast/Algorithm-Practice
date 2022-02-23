package offer58_1;

public class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = s1.length - 1; i >= 0; i--) {
            if (!s1[i].equals("")) {
                sb.append(s1[i] + " ");
            }
        }
        // trim() : 会去除字符串前后的空格
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "a good   example";
        System.out.println(s.reverseWords(str));
    }
}
