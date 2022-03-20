package HOT100题;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/20 - 18:21
 **/
public class HOT_207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

//        邻接表
        List<List<Integer>> adjacency=new ArrayList<>();
//        入度表
        int[] indegrees=new int[numCourses];
//        队列
        Deque<Integer> queue=new LinkedList<>();
//        计算入度  并且构建邻接表
        for(int i=0;i<numCourses;i++){
            adjacency.add(new ArrayList<>());
        }
        for(int []p:prerequisites){
            indegrees[p[0]]++;
            adjacency.get(p[1]).add(p[0]);
        }
//        将入度为0的放入队列
        for(int i=0;i<numCourses;i++){
            if(indegrees[i]==0) queue.add(i);
        }
//        循环队列  并更新入度  让numCourses--
        while(!queue.isEmpty()){
            int pre=queue.poll();
            numCourses--;
            for(int cur:adjacency.get(pre)){
                indegrees[cur]--;
                if(indegrees[cur]==0) queue.offer(cur);
            }
        }
//        判断是否为0 返回结果
        return numCourses==0;



    }
}
