package 剑指OFFER;

import java.util.Stack;

/**
 * @author lusir
 * @date 2021/11/17 - 18:30
 **/
public class offer_36 {
    Node head,pre;
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        dfs(root);
        pre.right=head;
        head.left=pre;
        return head;
    }
    public  void dfs(Node root){
        if(root==null) return ;
        dfs(root.left);
        if(pre==null) head=root;
        else pre.right=root;
        root.left=pre;
        pre=root;
        dfs(root.right);
    }

//        超出时间限制  暂不知对否   但是逻辑是对的
//        if(root==null) return null;
//        Stack<Node> stack=new Stack<>();
//        Node head=new Node(0);
//        Node pre=head;
//        Node node=root;
//        while (!stack.isEmpty()||node!=null){
//            if(node.left!=null){
//                stack.push(node.left);
//                node=node.left;
//                continue;
//            }
//            node=stack.pop();
//            pre.right=node;
//            node.left=pre;
//            pre=pre.right;
//            if(node.right!=null){
//                stack.push(node.right);
//                node=node.right;
//            }
//
//
//        }
//        pre.right=head.right;
//        head.right.left=pre;
//        return head.right;









   public class Node {
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
    };
}

