package ½£Ö¸offerÍ»»÷°æ;

/**
 * @author lusir
 * @date 2022/4/21 - 10:44
 **/
public class _048 {
     class Codec {
        int index=0;
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root==null) return "NULL#";
            return root.val+"#"+serialize(root.left)+serialize(root.right);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] strList = data.split("#");
            return dfs(strList);
        }
        public TreeNode dfs(String[]strList) {
            if (index>=strList.length) return null;
            String str=strList[index++];
            if (str.equals("NULL")){
                return null;
            }
            TreeNode root=new TreeNode(Integer.parseInt(str));
            root.left=dfs(strList);
            root.right=dfs(strList);
            return root;
        }
    }
}
