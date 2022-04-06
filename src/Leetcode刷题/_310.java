package LeetcodeÀ¢Ã‚;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/4/6 - 8:41
 **/
public class _310 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<List<Integer>> adjList=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        if (n==1) {
            res.add(0);
            return  res;
        }
        int []degree=new int[n];
        for (int i=0;i<n;i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int []pre=edges[i];
            adjList.get(pre[0]).add(pre[1]);
            adjList.get(pre[1]).add(pre[0]);
            degree[pre[0]]++;
            degree[pre[1]]++;
        }
        int nodeNum=n;
        Deque<Integer> queue=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degree[i]==1){
                queue.offer(i);
            }
        }
        while (nodeNum>2) {
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                int num = queue.pop();
                for (int item : adjList.get(num)) {
                    if ((--degree[item])==1){
                        queue.offer(item);
                        nodeNum--;
                    }
                }
            }

        }
        while (!queue.isEmpty()){
            res.add(queue.poll());
        }
        return res;
    }


}
