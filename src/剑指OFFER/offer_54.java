package ½£Ö¸OFFER;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author lusir
 * @date 2021/11/13 - 15:19
 **/
public class offer_54 {
    int res,m;
    public int kthLargest(TreeNode root, int k) {
        m=k;
        dfs(root);

        return res;

    }
    public  void dfs(TreeNode  root){
        if(root==null) return ;
        if(m==0) return;
        dfs(root.right);

        if(--m==0) res=root.val;
        dfs(root.left);
    }
}
