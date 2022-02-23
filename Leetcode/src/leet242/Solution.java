package leet242;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        StringBuilder sbs = new StringBuilder(s);
        StringBuilder sbt = new StringBuilder(t);
        int i = 0;
        while( i < sbs.length()){
            for(int j = 0;j<sbt.length();j++){
                if(sbs.charAt(i) == sbt.charAt(j)){
                    sbt.delete(j,j+1);
                    break;
                }
                if(j == sbt.length()){
                    return false;
                }
            }
            i++;
            if(sbt.length() == 0 && i != sbs.length()){
                return false;
            }
        }
        return i == sbs.length() && sbt.length() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
