package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/12 - 17:07
 **/
public class _98 {

    long pre=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;
        boolean L = isValidBST(root.left);
        if (!L||root.val<=pre) return false;
        pre=root.val;
        boolean R=isValidBST(root.right);
        if (!R) return false;
        return true;
    }
}
