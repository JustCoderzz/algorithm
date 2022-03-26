package LeetcodeÀ¢Ã‚;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/25 - 22:43
 **/
public class _146 {
    class LRUCache {

        int capacity;
        Map<Integer,Node> key_table;
        MyLinkDoublyList list;
        public LRUCache(int capacity) {
            this.capacity=capacity;
            key_table=new HashMap<>();
            list=new MyLinkDoublyList();
        }

        public int get(int key) {
            if (list.size==0) return -1;
            if (key_table.containsKey(key)) {
                Node node=key_table.get(key);
                list.moveToHead(node);
                return node.val;
            }else return -1;
        }

        public void put(int key, int value) {
            if (key_table.containsKey(key)) {
                Node node=key_table.get(key);
                list.moveToHead(node);
                node.val=value;
                key_table.put(key,node);
                return;
            }else if (list.size==capacity){
                key_table.remove(list.getTail().key);
                list.remove(list.getTail());

            }
            Node n=new Node(key,value);
            key_table.put(key,n);
            list.add(n);

        }
    }

    class Node{
        int key;
        int val;
        Node next;
        Node pre;
        Node(){

        }
        Node(int key,int val) {
            this.key=key;
            this.val=val;
        }
    }

    class MyLinkDoublyList {
        Node head;
        Node tail;
        int size;

        MyLinkDoublyList(){
            head=new Node();
            tail=new Node();
            head.next=tail;
            tail.pre=head;
            size=0;
        }

        public void remove(Node node) {
            node.pre.next=node.next;
            node.next.pre=node.pre;
            size--;
        }

        public Node getHead(){
            return head.next;
        }

        public Node getTail() {
            return tail.pre;
        }
        public  void moveToHead(Node node) {
            remove(node);
            add(node);
        }
        public void add(Node node) {
            node.next=head.next;
            head.next.pre=node;
            node.pre=head;
            head.next=node;
            size++;
        }
    }
}
