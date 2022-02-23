package leet2011;

public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int i = 0;
        for(String str : operations){
            if(str.equals("++X")){
                ++i;
            }
            if(str.equals("X++")){
                i++;
            }
            if(str.equals("X--")){
                i--;
            }
            if(str.equals("--X")){
                --i;
            }
        }
        return i;
    }
}