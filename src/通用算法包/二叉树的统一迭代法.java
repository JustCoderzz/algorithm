package 通用算法包;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author lusir
 * @date 2022/1/22 - 14:47
 **/
public class 二叉树的统一迭代法 {
    //    前序遍历
    public List<Integer> preorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node != null) {
                stack.pop();
                if (node.right != null) stack.push(node.right);
                if (node.left != null) stack.push(node.left);

                stack.push(node);
                stack.push(null);
            } else {
                stack.pop();
                node = stack.peek();
                stack.pop();
                result.add(node.val);
            }
        }
        return result;
    }

    //      中序遍历
    public List<Integer> inorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node != null) {
                stack.pop();
                if (node.right != null) stack.push(node.right);
                stack.push(node);
                stack.push(null);
                if (node.left != null) stack.push(node.left);


            } else {
                stack.pop();
                node = stack.peek();
                stack.pop();
                result.add(node.val);
            }
        }
        return result;
    }

    public List<Integer> postorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node != null) {
                stack.pop();
                stack.push(node);
                stack.push(null);
                if (node.right != null) stack.push(node.right);

                if (node.left != null) stack.push(node.left);


            } else {
                stack.pop();
                node = stack.peek();
                stack.pop();
                result.add(node.val);
            }
        }
        return result;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    ;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
