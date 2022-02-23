package leet1894;

public class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        // 数量
        int num = k;
        while(true){
            for(int i =0;i<chalk.length;i++){
                if(k<chalk[i]){
                    return i;
                }
                k -= chalk[i];
            }
        }
    }
}
