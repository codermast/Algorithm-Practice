package leet290;

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
                    // 遍历Map，查找对应 value 的 key 值
                    if(entry.getValue().equals(sarr[i])){
                        // 如果对应value的key和实际的不一致，则false
                        if(!entry.getKey().equals(c)){
                            return false;
                        }
                    }
                }
            } else{
                // 不包含Key 和 value，则put进key-value键值对
                map.put(c,sarr[i]);
            }
        }
        // 如果i走到最后则说明已经判断完全了，可以返回true
        return i == pattern.length();
    }
}
