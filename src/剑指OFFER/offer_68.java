package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/14 - 14:33
 **/
public class offer_68 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        自己的做法
        if(p.val>=root.val&&q.val<=root.val){
            return root;
        }
        if(p.val<=root.val&&q.val>=root.val){
            return root;
        }
        if(p.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }else{
            return lowestCommonAncestor(root.right,p,q);
        }
//        官方做法
//        TreeNode ancestor = root;
//        while (true) {
//            if (p.val < ancestor.val && q.val < ancestor.val) {
//                ancestor = ancestor.left;
//            } else if (p.val > ancestor.val && q.val > ancestor.val) {
//                ancestor = ancestor.right;
//            } else {
//                break;
//            }
//        }
//        return ancestor;
//


    }
}
