//package problem.leet239;
//
//import java.util.*;
//
//public class Solution {
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        if(k == 1){
//            return nums;
//        }
//
//        if(nums.length <= k){
//            int[] copyOf = Arrays.copyOf(nums, nums.length);
//
//            Arrays.sort(copyOf);
//            int[] ret = new int[1];
//            ret[0] = copyOf[copyOf.length - 1];
//            return ret;
//        }
//
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i : nums){
//            if(queue.size() < k){
//                queue.offer(i);
//            }else{
//                break;
//            }
//        }
//
//    }
//}
