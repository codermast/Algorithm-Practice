package leet204;

public class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for(int i = 0;i<n;i++){
            if(isPrimes(i)){
                count++;
            }
        }
        return count;
    }
    public boolean isPrimes(int n){
        if(n<3){
            if(n == 2){
                return true;
            }else{
                return false;
            }
        }
        for(int i = 2;i<n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.countPrimes(10));
    }
}
