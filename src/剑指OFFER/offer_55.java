package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/13 - 15:14
 **/
public class offer_55 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(1+maxDepth(root.left),1+maxDepth(root.right));
    }
}
