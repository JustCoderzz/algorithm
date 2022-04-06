package 公司真题.腾讯音乐互娱;

/**
 * @author lusir
 * @date 2022/4/6 - 15:04
 **/
public class _4_6_3 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

     TreeNode pruneLeaves(TreeNode root) {
        if (dfs(root)) return null;
        else return root;
    }

    boolean dfs(TreeNode root) {
        if (root==null) return false;
        if (isLeaf(root.left)||isLeaf(root.right)) return true;
        boolean left=dfs(root.left);
        if (left) root.left=null;
        boolean right=dfs(root.right);
        if (right) root.right=null;
        return false;
    }
    boolean isLeaf(TreeNode root) {
        return root!=null&&root.left==null&&root.right==null;
    }

}
