package LeetcodeÀ¢Ã‚;

import java.util.*;

/**
 * @author lusir
 * @date 2022/4/6 - 0:27
 **/
public class _133 {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    public Node cloneGraph(Node node) {
        if (node==null) return node;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(node);
        Node root=new Node(node.val);
        Map<Node,Node> map=new HashMap<>();
        map.put(node,root);
        while (!queue.isEmpty()){
            Node cur=queue.poll();
            Node h = map.get(cur);
            for (Node tmp:cur.neighbors){
                if (!map.containsKey(tmp)) {
                    queue.add(tmp);
                    Node neb=new Node(tmp.val);
                    map.put(tmp,neb);
                }
                Node n1 = map.get(tmp);
                h.neighbors.add(n1);
                n1.neighbors.add(h);
            }
        }
        return  map.get(node);
    }
}
