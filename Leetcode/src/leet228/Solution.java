package leet228;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new LinkedList<>();

        int n = nums.length;
        int i = 0;
        int low = nums[0];
        int high = nums[0];
        while(i < n){
            if(nums[i] == high){
                high = nums[i];
            }else{
                StringBuilder sb = new StringBuilder(String.valueOf(low));
                if(low < high){
                    sb.append("->");
                    sb.append(String.valueOf(high));
                }
                list.add(sb.toString());
                low = nums[i];
                high = nums[i];
            }
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,7};
        List<String> strings = summaryRanges(arr);
        for(String s : strings){
            System.out.println(s);
        }
    }
}
