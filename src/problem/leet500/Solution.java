package problem.leet500;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new LinkedList<>();
        for (String word : words) {
            int line = getAkwordLine(word.charAt(0));
            int i = 0;
            for (; i < word.length(); i++) {
                if(getAkwordLine(word.charAt(i)) != line){
                    break;
                }
            }
            if(i == word.length()){
                list.add(word);
            }
        }
        String[] ret = new String[list.size()];
        for (int i = 0;i<list.size();i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    /*
    *   获取字母在美式键盘的哪一行
    * */
    public int getAkwordLine(char ch){
        ch = Character.toLowerCase(ch);

        String oneLine = "qwertyuiop";
        String twoLine = "asdfghjkl";
        String threeline = "zxcvbnm";

        if(oneLine.contains(String.valueOf(ch))){
            return 1;
        }else if(twoLine.contains(String.valueOf(ch))){
            return 2;
        }else{
            return 3;
        }
    }
}
