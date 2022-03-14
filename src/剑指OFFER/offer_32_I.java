package ½£Ö¸OFFER;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lusir
 * @date 2021/11/15 - 12:30
 **/
public class offer_32_I {
    public int[] levelOrder(TreeNode root) {
        if(root==null) return new int[0];
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> res=new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode tmp=queue.poll();
            res.add(tmp.val);
            if(tmp.left!=null) queue.offer(tmp.left);
            if(tmp.right!=null) queue.offer(tmp.right);
        }
        int []ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}
