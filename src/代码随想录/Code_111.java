package ´úÂëËæÏëÂ¼;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lusir
 * @date 2022/1/22 - 15:54
 **/
public class Code_111 {
    public  int minDepth(Code_337.TreeNode root){
        if(root==null) return 0;
        int depth=0;
        Queue<Code_337.TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){

            int size=queue.size();
            depth++;
            for(int i=0;i<size;i++){
                Code_337.TreeNode node=queue.peek();
                queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);

                if (node.left==null&&node.right==null) return depth;
            }
        }
        return depth;
    }
}
