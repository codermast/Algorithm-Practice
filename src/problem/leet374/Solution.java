package problem.leet374;

class GuessGame {
    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is lower than the guess number
     *			      1 if num is higher than the guess number
     *               otherwise return 0
     * int guess(int num);
     */
    int guess(int num){return -1;};
}


public class Solution extends GuessGame {
    // 二分查找的思路
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(guess(mid) == -1){
                // -1：我选出的数字比你猜的数字小 pick < num
                right = mid;
            }else if(guess(mid) == 1){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return left;
    }
}

