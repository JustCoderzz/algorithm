package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/13 - 10:13
 **/
public class offer_27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;

    }
}
