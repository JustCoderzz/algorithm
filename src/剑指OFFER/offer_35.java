package 剑指OFFER;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2021/11/25 - 8:42
 **/
public class offer_35 {
//    1 使用map集合构建一个源节点到新结点的映射，然后在遍历构建新链表个节点的next和random引用即可
//    public Node copyRandomList(Node head) {
//        if(head==null) return  null;
//        Node cur=head;
//        Map<Node,Node> map=new HashMap<>();
////        生成map映射
//        while(cur!=null){
//            map.put(cur,new Node(cur.val));
//            cur=cur.next;
//        }
//        cur=head;
//        while(cur!=null){
//            map.get(cur).next=map.get(cur.next);
//            map.get(cur).random=map.get(cur.random);
//            cur=cur.next;
//        }
//        return map.get(head);
//    }

//      迭代法 通过将原链表和新链表拼接 然后便可在访问源节点的random同时找到对应新节点的random
    public  Node copyRandomList(Node head){
        if(head==null) return null;
//        1.构建拼接链表
        Node cur=head;
        while(cur!=null){
            Node tmp=new Node(cur.val);
            tmp.next=cur.next;
            cur.next=tmp;
            cur=tmp.next;
        }
//        2.构建random指向
        cur=head;
        while (cur!=null){
            if(cur.random!=null){
                cur.next.random=cur.random.next;
            }
            cur=cur.next.next;
        }
//        3.拆分链表
        cur=head.next;
        Node pre=head;
        Node res=head.next;
        while(cur.next!=null){
            pre.next=pre.next.next;
            cur.next=cur.next.next;
            pre=pre.next;
            cur=cur.next;
        }
        pre.next=null;
        return res;

    }





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
}
