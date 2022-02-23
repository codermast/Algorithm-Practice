package problem.leet434;

public class Solution {
    public static int countSegments(String s) {
        if(s.equals("")){
            return 0;
        }
        String[] s1 = s.split(" ");
        int ret = s1.length;
        for(String str : s1){
            if(str.equals("")){
                ret--;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(countSegments(", , , ,        a, eaefa"));
    }
}
