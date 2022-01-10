package problem.leet451;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class CharNum {
    public char c;
    public int count;

    public CharNum(char c,int count){
        this.c = c;
        this.count = count;
    }
}

public class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        // 大堆
        PriorityQueue<CharNum> queue = new PriorityQueue<>(new Comparator<CharNum>() {
            @Override
            public int compare(CharNum o1, CharNum o2) {
                return o1.count - o2.count;
            }
        });
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            queue.add(new CharNum(entry.getKey(),entry.getValue()));
        }

        StringBuilder sb =new StringBuilder();
        while(!queue.isEmpty()){
            CharNum poll = queue.poll();
            for(int i = 0;i<poll.count;i++){
                sb.append(poll.c);
            }
        }
        return sb.toString();
    }
}
