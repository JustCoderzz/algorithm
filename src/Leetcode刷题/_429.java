package LeetcodeÀ¢Ã‚;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lusir
 * @date 2022/4/8 - 0:35
 **/
public class _429 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        if (root==null) return res;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size=queue.size();
            List<Integer> tmp=new ArrayList<>();
            for (int i=0;i<size;i++) {
               Node node= queue.poll();
               tmp.add(node.val);
               for (Node n: node.children) {
                   queue.offer(n);
               }
            }
            res.add(tmp);
        }
        return  res;
    }
}
