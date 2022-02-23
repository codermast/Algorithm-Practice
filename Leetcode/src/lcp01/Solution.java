package lcp01;
//https://leetcode-cn.com/problems/guess-numbers/
public class Solution {
    public int game(int[] guess, int[] answer) {
        int win = 0;
        for(int i = 0;i<guess.length;i++){
            if(guess[i] == answer[i]){
                win++;
            }
        }
        return win;
    }
}
