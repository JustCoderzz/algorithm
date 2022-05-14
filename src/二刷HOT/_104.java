package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/13 - 18:52
 **/
public class _104 {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}
