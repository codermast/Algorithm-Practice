package leet449;

import java.util.Arrays;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class CodeC {
    /*
     *   前序遍历 + 中序遍历 、 后序遍历 + 中序遍历 都可以唯一确定一棵二叉树
     *   二叉搜索树前序、后序遍历的结果排序就是中序遍历
     * */

    // 序列化
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        if (root == null) {
            return "";
        }

        // 这里使用先序遍历
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();

            if (pop.right != null) {
                stack.push(pop.right);
            }

            if (pop.left != null) {
                stack.push(pop.left);
            }

            sb.append(pop.val).append("#");
        }
        return sb.substring(0,sb.length() - 1);
    }

    // 反序列化
    public TreeNode deserialize(String data) {
        if (data.isEmpty()){
            return null;
        }
        String[] preStrArr = data.split("#");

        int[] preArr = new int[preStrArr.length];

        for (int i = 0; i < preArr.length; i++) {
            preArr[i] = Integer.parseInt(preStrArr[i]);
        }

        String[] innerStrArr = Arrays.copyOf(preStrArr, preStrArr.length);

        int[] innerArr = new int[innerStrArr.length];

        for (int i = 0; i < innerArr.length; i++) {
            innerArr[i] = Integer.parseInt(innerStrArr[i]);
        }

        Arrays.sort(innerArr);

        return buildTreeByPreAndInner(preArr, innerArr);
    }

    private TreeNode buildTreeByPreAndInner(int[] preArr, int[] innerArr) {
        // 如果遍历结果为空，则代表是空树
        if (preArr.length == 0) {
            return null;
        }

        // 根据前序遍历找到根节点的值，根节点的值为 先序遍历 的第一个数
        int rootVal = preArr[0];

        // 构建根节点
        TreeNode root = new TreeNode(rootVal);

        // 在 中序遍历 结果中找到 根的值 所在的位置
        int index = Arrays.binarySearch(innerArr,rootVal);

        // 切出左子树的 先序遍历 和 中序遍历
        int[] preLeftTree = Arrays.copyOfRange(preArr,1,index + 1);
        int[] innerLeftTree = Arrays.copyOfRange(innerArr,0, index);

        // 构建左子树
        root.left = buildTreeByPreAndInner(preLeftTree, innerLeftTree);


        // 切出右子树的 先序遍历 和 中序遍历
        int[] preRightTree = Arrays.copyOfRange(preArr,index + 1,preArr.length);
        int[] innerRightTree = Arrays.copyOfRange(innerArr,index + 1, innerArr.length);

        // 构建右子树
        root.right = buildTreeByPreAndInner(preRightTree, innerRightTree);

        return root;
    }

    public static void main(String[] args) {
        CodeC c = new CodeC();

        String preStr = "7#3#1#4#8#91";
        String preStr2 = "";

        TreeNode deserialize = c.deserialize(preStr);
        System.out.println(c.serialize(deserialize));


        TreeNode deserialize2 = c.deserialize(preStr2);
        System.out.println(c.serialize(deserialize2));
    }
}
