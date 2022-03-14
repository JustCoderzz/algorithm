package HOT100Ã‚;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lusir
 * @date 2021/11/29 - 14:07
 **/
public class HOT_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> tmp=new ArrayList<>();
            int l=queue.size();
            for(int i=0;i<l;i++){
                TreeNode node=queue.poll();
                tmp.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            res.add(tmp);


        }
        return res;
    }
}
