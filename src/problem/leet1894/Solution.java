package problem.leet1894;

public class Solution {
    public static int chalkReplacer(int[] chalk, int k) {
        // 粉笔数量
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
