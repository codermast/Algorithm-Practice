package leet383;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ranMap = new HashMap<>();
        Map<Character, Integer> magaMap = new HashMap<>();

        char[] ranChar = ransomNote.toCharArray();
        char[] magaChar = magazine.toCharArray();

        for (char c : ranChar) {
            ranMap.put(c, ranMap.getOrDefault(c, 0) + 1);
        }

        for (char c : magaChar) {
            magaMap.put(c, magaMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : ranMap.entrySet()) {
            Character key = entry.getKey();
            Integer val = entry.getValue();

            if (magaMap.get(key) == null) {
                return false;
            }

            if (magaMap.get(key) < val) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        // 为资源建立哈希表
        Map<Character,Integer> map = new HashMap<>();

        // 初始化资源哈希表
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (map.getOrDefault(c,0) == 0){
                map.put(c,1);
            }else {
                map.put(c,map.get(c) + 1);
            }
        }

        // 判断资源是否能满足
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            if (map.getOrDefault(c,0) == 0){
                // 如果不满足，则直接返回 false
                return false;
            }else {
                // 满足则判断下一个，并更新资源数量
                map.put(c,map.get(c) - 1);
            }
        }
        // 所有资源都满足时，则完全满足
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.canConstruct("a", "b"));
        System.out.println(s.canConstruct2("a", "b"));
    }
}
