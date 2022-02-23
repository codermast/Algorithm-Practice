package problem.leet014;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        for(String s : strs){
            if(s.length() < min){
                min = s.length();
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<min;i++){
            char c = strs[0].charAt(i);
            for(String s : strs){
                if(s.charAt(i) != c){
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"flower","flower","flower","flower"};
        Solution s = new Solution();

        System.out.println(s.longestCommonPrefix(arr));
    }
}
