package 二刷力扣;

import 代码随想录.TreeNode;

/**
 * @author lusir
 * @date 2022/3/13 - 14:01
 **/
public class _98 {
    public  boolean isValidBST(TreeNode root){

        return dfs(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public boolean dfs(TreeNode root,long min,long max){
        if(root==null) return true;

        if(root.val>=max||root.val<=min) return false;

        return dfs(root.left,min,root.val)&&dfs(root.right,root.val,max);

    }
    // public boolean isValidBST(TreeNode node, long lower, long upper) {
    //     if (node == null) {
    //         return true;
    //     }
    //     if (node.val <= lower || node.val >= upper) {
    //         return false;
    //     }
    //     return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
    // }
}
