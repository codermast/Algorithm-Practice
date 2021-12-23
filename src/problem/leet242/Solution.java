package problem.leet242;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> maps = new HashMap<>();
        Map<Character,Integer> mapt = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            maps.put(c,maps.getOrDefault(c,0)+1);
        }
        for(int i = 0;i<t.length();i++){
            char c = t.charAt(i);
            mapt.put(c,mapt.getOrDefault(c,0)+1);
        }

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(maps.get(c) != mapt.get(c)){
                return false;
            }
        }

        for(int i = 0;i<t.length();i++){
            char c = t.charAt(i);
            if(maps.get(c) != mapt.get(c)){
                return false;
            }
        }
        return true;
    }
}
