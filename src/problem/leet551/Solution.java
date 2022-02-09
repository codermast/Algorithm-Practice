package problem.leet551;

public class Solution {
    public static boolean checkRecord(String s) {
        int index = s.indexOf("LLL");

        if(index >= 0){
            return false;
        }
        int numA = 0;
        for(char c : s.toCharArray()){
            if(c == 'A'){
                numA ++;
            }
            if(numA >= 2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLL"));
    }
}
