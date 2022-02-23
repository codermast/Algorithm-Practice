package leet1078;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static String[] findOcurrences(String text, String first, String second) {
        Queue<String> queue = new LinkedList<>();
        String[] s = text.split(" ");
        for(int i = 0;i<s.length - 1;i++){
            if(s[i].equals(first) && s[i + 1].equals(second)){
                if(i + 2 <s.length){
                    queue.offer(s[i + 2]);
                }
            }
        }

        String[] ret = new String[queue.size()];
        for(int i = 0;i< ret.length;i++){
            ret[i] = queue.poll();
        }
        return ret;
    }

    public static void main(String[] args) {
        // 测试用例
        String[] ocurrences = findOcurrences("alice is a good girl she is a good student", "a", "good");
        System.out.println(Arrays.toString(ocurrences));
    }
}
