package problem.leet1832;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            set.add(c);
        }

        return set.size() == 26;
    }
}
