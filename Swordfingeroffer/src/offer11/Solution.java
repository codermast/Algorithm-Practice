package offer11;

public class Solution {
    public int minArray(int[] numbers) {
        int min = numbers[0];
        for(int n : numbers){
            if(n < min){
                min = n;
            }
        }
        return min;
    }
}
