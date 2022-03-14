package HOT100题;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2021/12/1 - 9:16
 **/
public class HOT_146 {
    class LRUCache extends LinkedHashMap<Integer, Integer>{
        private int capacity;

        public LRUCache(int capacity) {
            super(capacity, 0.75F, true);
            this.capacity = capacity;
        }

        public int get(int key) {
            return super.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            super.put(key, value);
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }
    }



//    自己实现双链表  +hash
//    public  class LRUCache{
//        class  DLinkedNode{
//            int k;
//            int v;
//            DLinkedNode pre;
//            DLinkedNode next;
//            public  DLinkedNode(){};
//            public  DLinkedNode(int _k,int _v){
//                k=_k;
//                v=_v;
//            }
//        }
//
//        public Map<Integer,DLinkedNode> cached=new HashMap<>();
//        private  int size;
//        private  int capacity;
//        private  DLinkedNode head,tail;
//
//
//        public  LRUCache(int capacity){
//            this.size=0;
//            this.capacity=capacity;
//            head=new DLinkedNode();
//            tail=new DLinkedNode();
//            head.next=tail;
//            tail.pre=head;
//        }
//
//        public int get(int key){
//            if(cached.containsKey(key)){
//                DLinkedNode node=cached.get(key);
//                removeNode(node);
//                addHead(node);
//
//                return node.v;
//            }else{
//                return -1;
//            }
//
//        }
//
//        public  void put(int k,int v){
//            if (cached.containsKey(k)){
//                DLinkedNode res=cached.get(k);
//                res.v=v;
//                removeNode(res);
//                addHead(res);
//
//
//
//            }else{
//                DLinkedNode res=new DLinkedNode(k,v);
//                cached.put(k,res);
//                addHead(res);
//                ++size;
//                if(size>capacity){
//                    DLinkedNode tail=removeTail();
//                    cached.remove(tail.k);
//                    --size;
//                }
//
//            }
//
//        }
//        public  void addHead(DLinkedNode node){
//            node.next=head.next;
//            node.pre=head;
//            head.next.pre=node;
//            head.next=node;
//        }
//        public  void removeNode(DLinkedNode node){
//            node.pre.next=node.next;
//            node.next.pre=node.pre;
//        }
//        public  DLinkedNode removeTail(){
//            DLinkedNode res=tail.pre;
//            removeNode(res);
//            return  res;
//        }
//
//
//    }


//    自己的做法  两个map  还没写完
//    class LRUCache {
//        Map<Integer,Integer> cached;
//        Map<Integer,Integer> counter;
//        int capacity;
//
//        public LRUCache(int capacity) {
//            cached=new HashMap<>();
//            counter=new HashMap<>();
//            this.capacity=capacity;
//        }
//
//        public int get(int key) {
//            for (Map.Entry<Integer,Integer> item:counter.entrySet()){
//                int k=item.getKey();
//                int v=item.getValue();
//                counter.put(k,v+1);
//            }
//            if(cached.containsKey(key)){
//
//                counter.put(key,0);
//                return cached.get(key);
//            }else{
//                return -1;
//            }
//
//
//        }
//
//        public void put(int key, int value) {
//            LinkedHashMap
//            if(cached.containsKey(key)){
//                cached.put(key,value);
//            }else{
//                if(cached.size()<capacity){
//                    cached.put(key,value);
//                    counter.put(key,0);
//                }else{
//                    Integer maxKey=null;
//                    Integer maxValue=null;
//                    for(Map.Entry<Integer,Integer> item:counter.entrySet()){
//                        int k=item.getKey();
//                        int v=item.getValue();
//                        if(maxValue==null||v>maxValue){
//                            maxKey=k;
//                        }
//                    }
//                    cached.remove(maxKey);
//                    counter.remove(maxKey);
//                    cached.put(key,value);
//                    counter.put(key,0);
//                }
//            }
//
//        }
//    }
}
