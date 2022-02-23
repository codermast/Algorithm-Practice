package offer21;

import java.util.Stack;
// https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
public class Solution {
    public int[] exchange(int[] nums) {
        int[] ret = new int[nums.length];

        // 奇数栈
        Stack<Integer> odd = new Stack<>();
        // 偶数栈
        Stack<Integer> even = new Stack<>();

        for(int i : nums){
            if(i % 2 == 0){
                even.push(i);
            }else{
                odd.push(i);
            }
        }
        int i = 0;
        while(!odd.empty()){
            ret[i] = odd.pop();
            i++;
        }
        while(!even.empty()){
            ret[i] = even.pop();
            i++;
        }
        return ret;
    }
}
