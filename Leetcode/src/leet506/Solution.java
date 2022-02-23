package leet506;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    static class Node {
        int num;
        int index;

        public Node(int num,int index) {
            this.num = num;
            this.index = index;
        }
    }

    public String[] findRelativeRanks(int[] score) {
        String[] ret = new String[score.length];

        PriorityQueue<Node> queue = new PriorityQueue<>(score.length, ((o1, o2) -> o2.num - o1.num));

        for (int i = 0;i<score.length;i++) {
            queue.add(new Node(score[i],i));
        }

        int ranking = 1;
        while (!queue.isEmpty()){
            Node poll = queue.poll();
            ret[poll.index] = getInfor(ranking);
            ranking++;
        }
        return ret;
    }

    private String getInfor(int ranking) {
        switch(ranking){
            case 1:return "Gold Medal";
            case 2:return "Silver Medal";
            case 3:return "Bronze Medal";
            default:return String.valueOf(ranking);
        }
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        int[] arr = {5,4,3,2,1};
        int[] arr2 = {10,3,8,9,4};

        System.out.println(Arrays.toString(s.findRelativeRanks(arr)));
        System.out.println(Arrays.toString(s.findRelativeRanks(arr2)));
    }
}
