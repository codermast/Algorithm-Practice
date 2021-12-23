package problem.leet167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                if(i != j && numbers[i] + numbers[j] == target){
                    int[] ret = new int[2];
                    ret[0] = i + 1;
                    ret[1] = j + 1;
                    return ret;
                }
            }
        }
        return null;
    }
}
