package leet1441;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new LinkedList<>();
        int i = 1;
        for (int num  : target) {
            while(i <= n){
                if (num == i){
                    list.add("Push");
                    i++;
                    break;
                }else{
                    list.add("Push");
                    list.add("Pop");
                }
                i++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution  s= new Solution();
        int[] arr = {1,2,3};
        System.out.println(s.buildArray(arr, 3).toString());
    }
}
