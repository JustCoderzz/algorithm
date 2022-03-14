package 二刷力扣;

import 代码随想录.TreeNode;

/**
 * @author lusir
 * @date 2022/3/5 - 12:46
 **/
public class _236 {
    public TreeNode  LowestCommonAncestor(TreeNode root,TreeNode p, TreeNode q){
        if(root==p||root==q||root==null){
            return root;
        }
        TreeNode left=LowestCommonAncestor(root.left,p,q);
        TreeNode right=LowestCommonAncestor(root.right,p,q);
        return left==null?right:(right==null)?left:root;

    }
}
