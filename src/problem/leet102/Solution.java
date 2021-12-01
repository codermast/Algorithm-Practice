package problem.leet102;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {


 static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

    /*
    *     层序遍历
    * */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 存放返回值
         List<List<Integer>> ret = new LinkedList<>();
        // 判断根是否为 null
         if(root == null){
              return ret;
         }

         // 队列用来存放节点
         Queue<TreeNode> queue = new LinkedList<>();
         // 将根压入队列
         queue.offer(root);
         // 循环遍历

        // 不为空才开始循环遍历
         while(!queue.isEmpty()){
             // 保存队列的长度
             int size = queue.size();
             // 返回值内的元素，一维列表
             List<Integer> integers = new LinkedList<>();
             for(int i = 0;i<size;i++){
                 // 出队一个结点 ，将其左右节点再推进队列
                 TreeNode poll = queue.poll();

                 // 弹出一个结点，将其 左、右 结点压入，如果为null则不压入
                 if(poll.left != null){
                     queue.offer(poll.left);
                 }

                 if(poll.right != null){
                     queue.offer(poll.right);
                 }
                // 将元素值进行压入
                 integers.add(poll.val);
             }
             // 将返回值中的一维链表压入
             ret.add(integers);
         }
         // 返回值
         return ret;
    }
}
