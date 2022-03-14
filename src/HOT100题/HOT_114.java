package HOT100题;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author lusir
 * @date 2021/11/30 - 15:49
 **/
public class HOT_114 {

    public void flatten(TreeNode root) {
        while(root!=null){
            if(root.left==null){
                root=root.right;
            }else{
                TreeNode pre=root.left;
                while(pre.right!=null){
                    pre=pre.right;
                }
                pre.right=root.right;
                root.right=root.left;
                root.left=null;
                root=root.right;
            }
        }


    }










//    个人暴力解法
//    Queue<TreeNode> queue=new LinkedList<>();
//    public void flatten(TreeNode root) {
//
//        preOrder(root);
//        queue.poll();
//        while(!queue.isEmpty()){
//            root.right=queue.poll();
//            root.left=null;
//            root=root.right;
//        }
//
//    }
//
//    public  void preOrder(TreeNode root){
//        if(root==null){
//            return;
//        }
//        queue.offer(root);
//        preOrder(root.left);
//        preOrder(root.right);
//    }
}
