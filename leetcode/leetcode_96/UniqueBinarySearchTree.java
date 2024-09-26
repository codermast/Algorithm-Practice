package leetcode_96;

public class UniqueBinarySearchTree {

    public int numTrees(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; ++i) {
            // i 为几个节点时，dp[i] 为 i 个结点的时候，不同二叉搜索树的个数
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        UniqueBinarySearchTree instance = new UniqueBinarySearchTree();

        System.out.println(instance.numTrees(3));
    }

}
