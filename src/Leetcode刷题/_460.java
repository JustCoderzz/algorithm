package LeetcodeÀ¢Ã‚;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/24 - 12:10
 **/
public class _460 {

    class LFUCache {
        int capacity;
        int minFreq;
        Map<Integer,DoublyLinkedList> freq_table;
        Map<Integer,Node> key_table;

        public LFUCache(int capacity) {
            this.capacity=capacity;
            this.minFreq=0;
            freq_table=new HashMap<>();
            key_table=new HashMap<>();
        }

        public int get(int key) {
            if(capacity==0) return -1;
            if(!key_table.containsKey(key)) return -1;
            Node cur=key_table.get(key);
            int val=cur.val;
            int freq=cur.freq;
            freq_table.get(freq).remove(cur);
            if(freq_table.get(freq).size==0){
                freq_table.remove(freq);
                if(minFreq==freq){
                    minFreq++;
                }
            }
            freq+=1;
            if(freq_table.containsKey(freq)){
                DoublyLinkedList list=freq_table.get(freq);
                list.addFirst(new Node(key,val,freq));
            }else{
                DoublyLinkedList list=new DoublyLinkedList();
                list.addFirst(new Node(key,val,freq));
                freq_table.put(freq,list);
            }
            key_table.put(key,freq_table.get(freq).getHead());
            return val;

        }

        public void put(int key, int value) {
            if(capacity==0) return;
            if(key_table.containsKey(key)){
                Node cur=key_table.get(key);
                int val=cur.val;
                int freq=cur.freq;
                freq_table.get(freq).remove(cur);
                if(freq_table.get(freq).size==0){
                    freq_table.remove(freq);
                    if(minFreq==freq){
                        minFreq++;
                    }
                }
                freq+=1;
                if(freq_table.containsKey(freq)){
                    DoublyLinkedList list=freq_table.get(freq);
                    list.addFirst(new Node(key,value,freq));
                }else{
                    DoublyLinkedList list=new DoublyLinkedList();
                    list.addFirst(new Node(key,value,freq));
                    freq_table.put(freq,list);
                }
                key_table.put(key,freq_table.get(freq).getHead());

            }else{
                if(key_table.size()==capacity){
                    DoublyLinkedList list=freq_table.get(minFreq);
                    Node tail = list.getTail();
                    key_table.remove(tail.key);
                    list.remove(tail);
                    if(list.size==0){
                        freq_table.remove(minFreq);
                    }

                }
                DoublyLinkedList _oneFreq=freq_table.getOrDefault(1,new DoublyLinkedList());
                _oneFreq.addFirst(new Node(key,value,1));
                freq_table.put(1,_oneFreq);
                key_table.put(key,freq_table.get(1).getHead());
                minFreq=1;
            }
        }
    }

    class  Node {
        int key;
        int val;
        int freq;
        Node next;
        Node pre;

        Node() {
            this(-1,-1,0);
        }

        Node(int key,int val,int freq) {
            this.key=key;
            this.val=val;
            this.freq=freq;
        }
    }

    class DoublyLinkedList {
        Node dummyHead,dummyTails;
        int size;

        DoublyLinkedList() {
            dummyHead=new Node();
            dummyTails=new Node();
            dummyHead.next=dummyTails;
            dummyTails.pre=dummyHead;
            size=0;
        }

        public  void addFirst(Node node){
            node.next=dummyHead.next;
            dummyHead.next.pre=node;
            dummyHead.next=node;
            node.pre=dummyHead;
            size++;
        }

        public  void  remove(Node node){
            Node pre=node.pre;
            Node next=node.next;
            pre.next=next;
            next.pre=pre;
            size--;
        }
        public  Node getHead(){
            return dummyHead.next;
        }

        public  Node getTail(){
            return dummyTails.pre;
        }
    }
}
