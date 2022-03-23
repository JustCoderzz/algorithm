package LeetcodeÀ¢Ã‚;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/23 - 10:10
 **/

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class _138 {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap<>();
        Node cur=head.next;
        Node root=new Node(head.val);
        map.put(head,root);
        Node pre=root;
        while(cur!=null){
            Node tmp=new Node(cur.val);
            map.put(cur,tmp);
            cur=cur.next;
            pre.next=tmp;
            pre=pre.next;
        }
        pre.next=null;
        pre=pre.next;
        map.put(null,pre);
        cur=head;
        Node node=root;
        while(cur!=null){
            if(map.containsKey(cur.random)){
                node.random=map.get(cur.random);
            }
            cur=cur.next;
            node= node.next;
        }
        return root;
    }
}
