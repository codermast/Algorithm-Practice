package leet859;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public boolean buddyStrings(String s, String goal) {
        int n = s.length(), m = goal.length();
        if (n != m) return false;
        int[] cnt1 = new int[26], cnt2 = new int[26];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = s.charAt(i) - 'a', b = goal.charAt(i) - 'a';
            cnt1[a]++; cnt2[b]++;
            if (a != b) sum++;
        }
        boolean ok = false;
        for (int i = 0; i < 26; i++) {
            if (cnt1[i] != cnt2[i]) return false;
            if (cnt1[i] > 1) ok = true;
        }
        return sum == 2 || (sum == 0 && ok);
    }

//    public boolean buddyStrings(String s, String goal) {
//        if(s.length() != goal.length()){
//            return false;
//        }
//        int indexAct = Integer.MAX_VALUE;
//        int indexLast = Integer.MIN_VALUE;
//        boolean isTrue = true;
//        for(int i = 0;i<s.length();i++){
//            if(s.charAt(i) != goal.charAt(i)){
//                if(isTrue){
//                    indexAct = i;
//                    isTrue = false;
//                }else{
//                    indexLast = i;
//                    break;
//                }
//            }
//        }
//        Map<Character,Integer> map = new HashMap<>();
//
//        for(int i = 0;i<s.length();i++){
//            if(s.charAt(i) == goal.charAt(i)){
//                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
//            }
//        }
//
//        if(s.equals(goal)){
//            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//                if(entry.getValue() >= 2){
//                    return true;
//                }
//            }
//        }
//
//        if(indexAct == indexLast){
//            return false;
//        }
//
//        StringBuilder sbs = new StringBuilder(s);
//        char act = s.charAt(indexLast);
//        sbs.replace(indexLast,indexLast + 1,String.valueOf(s.charAt(indexAct)));
//        sbs.replace(indexAct,indexAct + 1,String.valueOf(act));
//
//        return sbs.toString().equals(goal);
//    }
}
