package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/14 - 15:47
 **/
public class offer_62_II {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        白嫖的答案
        //1.如果找不到p或q就返回null,如果找的到就返回该点 ps:我觉得return root设计的很巧妙
        if(root == null || root == p || root == q) return root;
        //2.如果左子树中有p或q,那么就会返回找到的点。或者p和q都有，就返回pq的公共点。或者p或q都没有就返回null。
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        //3.如果右子树中有p||q,那么就会返回找到的点。或者p和q都有，就返回pq的公共点。或者p或q都没有就返回null。
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //4.left==null 说明：左子树中没有p或q(往上看最开始的判断语句：找不到就返回null)
        // 5.直接返回right的原因，需要结合递归的思想多方面思考。
        if(left == null) return right;
        //6.运行到此处说明左子树中找到了p或q点。
        if(right == null) return left;
        //7.运行到此处说明p和q都找到了，root为最近的公共祖先。(该语句只会运行一次)
        return root;
    }
}
