package problem.leet290;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String[] sarr = s.split(" ");

        if(pattern.length() != sarr.length){
            return false;
        }

        int i = 0;
        for(;i<pattern.length();i++){
            char c = pattern.charAt(i);
            if (map.containsKey(c)){
                // 包含对应的Key
                if(!map.get(c).equals(sarr[i])){
                    return false;
                }
            }else if(map.containsValue(sarr[i])){
                // 包含对应的 Value 值
                Set<Map.Entry<Character, String>> entries = map.entrySet();
                for (Map.Entry<Character, String> entry : entries) {
                    if(entry.getValue().equals(sarr[i])){
                        if(!entry.getKey().equals(c)){
                            return false;
                        }
                    }
                }
            } else{
                map.put(c,sarr[i]);
            }
        }
        return i == pattern.length();
    }
}
