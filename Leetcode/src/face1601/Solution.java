package face1601;

public class Solution {
    public int[] swapNumbers(int[] numbers) {
        numbers[0] = numbers[0] ^ numbers[1];
        numbers[1] = numbers[1] ^ numbers[0];
        numbers[0] = numbers[0] ^ numbers[1];
        return numbers;
    }
}
