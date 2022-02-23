package leet541;

public class Solution {

    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] arr = s.toCharArray();
        // 每次增加 2k 长度
        for(int i = 0;i<s.length();i += k * 2){
            myReverse(arr,i,i + k);
        }

        int surplus = n % (k * 2);

        if(surplus < k){
            myReverse(arr,n - surplus - 1,n);
        }

        if(surplus < k * 2 && surplus >= k){
            myReverse(arr,n - surplus - 1,n - surplus - 1 + k);
        }

        return new String(arr);
    }

    private void myReverse(char[] arr, int start, int end) {
        while (start < end){
            char c = arr[start];
            arr[start] = arr[end - 1];
            arr[end - 1] = c;
            start++;
            end --;
        }
    }
}
