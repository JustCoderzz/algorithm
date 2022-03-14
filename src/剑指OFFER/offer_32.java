package ½£Ö¸OFFER;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lusir
 * @date 2021/11/13 - 14:18
 **/
public class offer_32 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if (root==null) return list;
        Queue<TreeNode> queue=new LinkedList<>();

        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> tmp=new ArrayList<>();
            for(int i=queue.size();i>0;i--){
                TreeNode node=queue.poll();
                tmp.add(node.val);

                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            list.add(tmp);
        }
        return  list;

    }
}
