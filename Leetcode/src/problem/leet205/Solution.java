package problem.leet205;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // 通过map来存储字符之间的映射关系
        Map<Character,Character> maps = new HashMap<>();
        Map<Character,Character> mapt = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            if(maps.containsKey(s.charAt(i))){
                // 包含任意一个字符串中的字符
                if(maps.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else {
                maps.put(s.charAt(i),t.charAt(i));
            }

            if(mapt.containsKey(t.charAt(i))){
                // 包含任意一个字符串中的字符
                if(mapt.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }else {
                mapt.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        s.isIsomorphic("paper","title");
    }
}
