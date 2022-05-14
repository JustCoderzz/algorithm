package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/13 - 20:29
 **/
public class _124 {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return max;
    }
    public int maxPath(TreeNode root) {
        if (root==null) return 0;
        int L=maxPath(root.left);
        int R=maxPath(root.right);
        L=L<0?0:L;
        R=R<0?0:R;
        max=Math.max(max,L+R+root.val);
        return Math.max(L,R)+root.val;
    }
}
