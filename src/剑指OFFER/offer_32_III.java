package ½£Ö¸OFFER;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lusir
 * @date 2021/11/18 - 9:36
 **/
public class offer_32_III {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            LinkedList<Integer> tmp=new LinkedList<>();
            for(int i=queue.size()-1;i>=0;i--){
                TreeNode node=queue.poll();
                if((res.size()&1)==1){
                    tmp.addFirst(node.val);
                }else{
                    tmp.addLast(node.val);
                }
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            res.add(tmp);
        }
        return res;
    }
}
