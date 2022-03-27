package leet744;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target) {
                return letter;
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        char[] arr = {'c','f','j'};
        System.out.println(s.nextGreatestLetter(arr, 'a'));
    }
}
