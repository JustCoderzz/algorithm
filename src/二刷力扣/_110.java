package ¶þË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/5/3 - 19:59
 **/
public class _110 {

    public boolean isBalanced(TreeNode root) {
        return dfs(root)==-1?false:true;
    }

    public int dfs(TreeNode root) {
        if (root==null) return 0;
        int left=dfs(root.left);
        if (left==-1) return -1;
        int right=dfs(root.right);
        if (right==-1) return -1;
        return Math.abs(left-right)>1?-1:Math.max(left,right)+1;
    }
}
