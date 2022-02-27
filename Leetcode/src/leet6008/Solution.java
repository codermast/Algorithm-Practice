package leet6008;

public class Solution {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.length() < pref.length()) {
                continue;
            }
            String substring = word.substring(0, pref.length());
            if (substring.equals(pref)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"pay", "attention", "practice", "attend" };
        String[] arr2 = {"leetcode", "win", "loops", "success" };
        String[] arr3 = {"cullp", "ypfyqcljk", "jtuogvscob", "dsriyigc", "fr", "jtuogvscou", "doivwcgxpo", "jtuogvscob", "chuiw", "fqdhyhkvtz", "cszrtrff", "kssjy", "ps", "xvax", "vekbmwwnra" };
        System.out.println(prefixCount(arr, "at"));
        System.out.println(prefixCount(arr2, "code"));
        System.out.println(prefixCount(arr3, "jtuogvsco"));

    }
}
