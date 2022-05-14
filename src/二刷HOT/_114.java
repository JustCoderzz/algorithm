package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/13 - 20:02
 **/
public class _114 {
    public void flatten(TreeNode root) {
        if (root==null) return;
        TreeNode R=root.right;
        TreeNode largestR=getRightest(root.left);
        if (largestR!=null) {
            root.right=root.left;
            largestR.right=R;
        }
        root.left=null;
        flatten(root.right);
    }

    public TreeNode getRightest(TreeNode root) {
        if (root==null) return null;
        return root.right==null?root:getRightest(root.right);
    }
}
