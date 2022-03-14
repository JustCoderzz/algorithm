package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/19 - 10:27
 **/
public class offer_55_II {
    //    自己的做法   该方法会重复计算二叉树的深度   增加消耗
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(dfs(root.left) - dfs(root.right)) > 1 ? false : true && isBalanced(root.left) && isBalanced(root.right);

    }

    public int dfs(TreeNode node) {
        if (node == null) return 0;
        return Math.max(dfs(node.left) + 1, dfs(node.right) + 1);
    }
//    K神第一种做法   第二种与我一样   从子结点开始计算每一个结点的深度  不会重复计算
//    public boolean isBalanced(TreeNode root) {
//        return recur(root) != -1;
//    }
//
//    private int recur(TreeNode root) {
//        if (root == null) return 0;
//        int left = recur(root.left);
//        if(left == -1) return -1;
//        int right = recur(root.right);
//        if(right == -1) return -1;
//        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
//    }
//
}
