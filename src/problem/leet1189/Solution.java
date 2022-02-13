package problem.leet1189;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0) + 1);
        }

        int count = Integer.MAX_VALUE;
        count = Math.min(map.getOrDefault('b',0),count);
        count = Math.min(map.getOrDefault('a',0),count);
        count = Math.min(map.getOrDefault('l',0) / 2,count);
        count = Math.min(map.getOrDefault('o',0) / 2,count);
        count = Math.min(map.getOrDefault('n',0),count);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(maxNumberOfBalloons("leetcode"));
    }
}
