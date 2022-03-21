package HOT100Ã‚;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2022/3/21 - 14:41
 **/
public class HOT_297 {


    class Codec {
        int index=0;
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {

            StringBuilder sb=new StringBuilder();

            return dfs(root,sb);

        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] sList = data.split(",");

            return dfsTree(sList);
        }

        public  String dfs(TreeNode root,StringBuilder sb){
            if(root==null){
                sb.append("NULL,");
            }else{
                sb.append(root.val+",");
                sb=new StringBuilder(dfs(root.left,sb));
                sb=new StringBuilder(dfs(root.right,sb));
            }
            return sb.toString();
        }

        public  TreeNode dfsTree(String[] s){
            if(s[index].equals("NULL")){
                index++;
                return null;
            }
            TreeNode root=new TreeNode(Integer.valueOf(s[index]));
            index++;
            root.left=dfsTree(s);
            root.right=dfsTree(s);

            return root;
        }
    }
}
