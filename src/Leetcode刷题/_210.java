package Leetcode刷题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lusir
 * @date 2022/3/21 - 19:52
 **/
public class _210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
//        定义邻接表
        List<List<Integer>> adjList=new ArrayList<>();
//        定义入度表
        int [] orders=new int[numCourses];
//        初始化邻接表
        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }
//        填充入读表
        for(int i=0;i<prerequisites.length;i++){
            orders[prerequisites[i][0]]++;
            adjList.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
//        定义队列
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(orders[i]==0){
                queue.offer(i);
            }
        }
//        定义输出顺序
//        int index=0;
//        int[] res=new int[numCourses];
        List<Integer> res=new ArrayList<>();
        while(!queue.isEmpty()){
            int num= queue.poll();
            res.add(num);
            for(int i:adjList.get(num)){
                orders[i]--;
                if(orders[i]==0){
                    queue.offer(i);
                }
            }
        }
        int [] ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[0]=res.get(i);
        }
        return  ans;
    }
}
