package leet771;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] jewelsArr = jewels.toCharArray();
        char[] stonesArr = stones.toCharArray();

        for(char i : jewelsArr){
            for(char j : stonesArr){
                if(i == j){
                    count++;
                }
            }
        }
        return count;
    }
    /*
    *   测试用例
    * */
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numJewelsInStones("aA", "aAAbbbb"));
    }
}
