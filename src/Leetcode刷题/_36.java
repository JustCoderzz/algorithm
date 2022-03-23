package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/23 - 14:26
 **/

public class _36 {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    Node head,pre;
    public  Node treeToDoubleByList(Node root){
        dfs(root);
        head.left=pre;
        pre.right=head;
        return head;
    }

    public void dfs(Node root){
        if(root==null) return;
        dfs(root.left);
        if(pre!=null){
            pre.right=root;
            root.left=pre;
            pre=root;
        }
        if(root.left==null&&head==null){
            head=root;
            pre=root;
        }
        dfs(root.right);
    }
}
