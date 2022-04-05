package ½£Ö¸OFFER;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lusir
 * @date 2022/2/25 - 21:51
 **/
public class offer_37 {
    public class Codec {


        public String serialize(TreeNode root) {
            if (root==null) {
                return "#_";
            }
            String res=root.val+"_";
            res+=serialize(root.left);
            res+=serialize(root.right);
            return res;
        }


        public TreeNode deserialize(String data) {
            String[] s = data.split("_");
            Queue<String> queue=new LinkedList<>();
            for (int i=0;i<s.length;i++) {
                queue.offer(s[i]);
            }
            return dfs(queue);
        }
        public  TreeNode dfs(Queue<String> queue) {
            if (queue.isEmpty()) return null;
            String s = queue.poll();
            if (s.equals("#")){
                return null;
            }
            TreeNode node = new TreeNode(Integer.valueOf(s));
            node.left=dfs(queue);
            node.right=dfs(queue);
            return node;
        }


    }
}
