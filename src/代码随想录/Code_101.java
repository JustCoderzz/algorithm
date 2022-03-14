package ´úÂëËæÏëÂ¼;

/**
 * @author lusir
 * @date 2022/1/22 - 16:13
 **/
public class Code_101 {
    public boolean isSymmetric(TreeNode root) {
        return isTrue(root,root);
    }
    public boolean isTrue(TreeNode left,TreeNode right){
        if(left==null&&left==null) return true;
        if(left==null||right==null) return false;
        if(left.val!=right.val) return false;
        if( isTrue(left.left,right.right)!=false&&isTrue(left.right,right.left)!=false) return true;
        return  false;
    }
}
