package ��ָOFFER;

/**
 * @author lusir
 * @date 2021/11/14 - 14:33
 **/
public class offer_68 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        �Լ�������
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
//        �ٷ�����
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
