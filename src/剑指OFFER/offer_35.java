package ��ָOFFER;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2021/11/25 - 8:42
 **/
public class offer_35 {
//    1 ʹ��map���Ϲ���һ��Դ�ڵ㵽�½���ӳ�䣬Ȼ���ڱ���������������ڵ��next��random���ü���
//    public Node copyRandomList(Node head) {
//        if(head==null) return  null;
//        Node cur=head;
//        Map<Node,Node> map=new HashMap<>();
////        ����mapӳ��
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

//      ������ ͨ����ԭ�����������ƴ�� Ȼ�����ڷ���Դ�ڵ��randomͬʱ�ҵ���Ӧ�½ڵ��random
    public  Node copyRandomList(Node head){
        if(head==null) return null;
//        1.����ƴ������
        Node cur=head;
        while(cur!=null){
            Node tmp=new Node(cur.val);
            tmp.next=cur.next;
            cur.next=tmp;
            cur=tmp.next;
        }
//        2.����randomָ��
        cur=head;
        while (cur!=null){
            if(cur.random!=null){
                cur.next.random=cur.random.next;
            }
            cur=cur.next.next;
        }
//        3.�������
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
