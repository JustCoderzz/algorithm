package HOT100Ìâ;

import javax.security.auth.kerberos.KerberosKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lusir
 * @date 2021/10/27 - 12:33
 **/
public class HOT_101 {
    public boolean isSymmetric(TreeNode root) {
        return isTrue(root,root);
    }
//    µÝ¹é
//    public boolean isTrue(TreeNode p,TreeNode q){
//        if(p==null&&q==null){
//            return true;
//        }
//        if(p==null||q==null){
//            return false;
//        }
//        return p.val==q.val&&isTrue(q.left,p.right)&&isTrue(q.right,p.left);
//    }
//    µü´ú
    public  boolean isTrue(TreeNode p, TreeNode q){
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(p);
        queue.offer(q);
        while(!queue.isEmpty()){
            p=queue.poll();
            q=queue.poll();
            if(p==null&&q==null){
                continue;
            }
            if(p==null||q==null||(p.val!=q.val)){
                return false;
            }
            queue.offer(p.left);
            queue.offer(q.right);

            queue.offer(p.right);
            queue.offer(q.left);
        }
        return true;
    }
}
