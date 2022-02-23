package problem.leet2000;

public class Solution {
    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);

        int firstIndex = sb.indexOf(String.valueOf(ch));

        StringBuilder sb2 = new StringBuilder(firstIndex + 1);

        for (int i = 0; i <= firstIndex; i++) {
            sb2.append(sb.charAt(i));
        }


        sb.replace(0,firstIndex + 1,sb2.reverse().toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd",'d'));
    }
}
