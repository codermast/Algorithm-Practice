package problem.leet338;

public class Solution {

    public int[] countBits(int n) {
        int[] ret = new int[n + 1];
        for(int i = 0;i <= n;i++){
            int count = 0;
            int num = i;
            for(int j = 0;j<32;j++){
                if((num & 1) == 1){
                    count ++;
                }
                num >>= 1;
            }
            ret[i] = count;
        }
        return ret;
    }
}
