package leet389;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> maps = new HashMap<>();
        Map<Character,Integer> mapt = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            maps.put(s.charAt(i),maps.getOrDefault(s.charAt(i),0) + 1);
        }
        for(int i = 0;i<t.length();i++){
            mapt.put(t.charAt(i),mapt.getOrDefault(t.charAt(i),0) + 1);
        }

        for(int i = 0;i<t.length();i++){
            char c = t.charAt(i);

            if(!maps.containsKey(c) && mapt.containsKey(c) || !maps.get(c).equals(mapt.get(c))){
                return c;
            }
        }
        return 'n';
    }
}
