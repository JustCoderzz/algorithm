package Leetcode刷题;

import java.util.*;

/**
 * @author lusir
 * @date 2022/4/8 - 16:57
 **/
public class _332 {


        Map<String, PriorityQueue<String>> map = new HashMap<>();
        LinkedList<String> resList = new LinkedList<>();
        public List<String> findItinerary(List<List<String>> tickets) {
            for (List<String> ticket : tickets) {
                String src = ticket.get(0);
                String dst = ticket.get(1);
                if (!map.containsKey(src)) {
                    PriorityQueue<String> pq = new PriorityQueue<>();
                    map.put(src, pq);
                }
                map.get(src).add(dst);
            }
            dfs("JFK");
            return resList;
        }
        public void dfs(String src) {
            PriorityQueue<String> pq = map.get(src);
            while (pq != null && !pq.isEmpty()){
                dfs(pq.poll());
            }
            resList.addFirst(src); // 递归到终点才开始保存机场到列表中,递归到终点才开始保存机场到列表中
        }





}
