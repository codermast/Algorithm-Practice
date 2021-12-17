package problem.face0101;

public class Solution {
    public boolean isUnique(String astr) {
        for(int i = 0;i<astr.length();i++){
            for(int j = i;j<astr.length();j++){
                if(astr.charAt(i) == astr.charAt(j) && i != j){
                    return false;
                }
            }
        }
        return true;
    }
}
