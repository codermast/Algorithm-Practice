package problem.leet461;

public class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int num = x ^ y;
        for(int i =0;i<32;i++){
            if((num & 1) == 1){
                count ++;
            }
            num >>= 1;
        }
        return count;
    }
}
