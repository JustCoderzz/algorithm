package ½£Ö¸offerÍ»»÷°æ;

import ´úÂëËæÏëÂ¼.TreeNode;

/**
 * @author lusir
 * @date 2022/4/9 - 15:48
 **/
public class _047 {
    public TreeNode pruneTree(TreeNode root) {
        return  dfs(root);
    }



    public TreeNode dfs(TreeNode root) {
        if (root==null) return null;
        if (root.val==0&&root.left==null&&root.right==null) return null;
        root.left=dfs(root.left);
        root.right=dfs(root.right);
        return root;
    }
}
//    public boolean dfs(TreeNode root) {
//        if (root==null) return false;
//        boolean L=dfs(root.left);
//        boolean R=dfs(root.right);
//        if (!L) root.left=null;
//        if (!R) root.right=null;
//        if (root.val==0) {
//            if (!L&&!R) return false;
//        }
//        return true;
//    }