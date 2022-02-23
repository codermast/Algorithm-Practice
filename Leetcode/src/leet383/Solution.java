package leet383;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ranMap = new HashMap();
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

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.canConstruct("a", "b"));
    }
}
