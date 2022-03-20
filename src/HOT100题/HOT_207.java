package HOT100��;

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

//        �ڽӱ�
        List<List<Integer>> adjacency=new ArrayList<>();
//        ��ȱ�
        int[] indegrees=new int[numCourses];
//        ����
        Deque<Integer> queue=new LinkedList<>();
//        �������  ���ҹ����ڽӱ�
        for(int i=0;i<numCourses;i++){
            adjacency.add(new ArrayList<>());
        }
        for(int []p:prerequisites){
            indegrees[p[0]]++;
            adjacency.get(p[1]).add(p[0]);
        }
//        �����Ϊ0�ķ������
        for(int i=0;i<numCourses;i++){
            if(indegrees[i]==0) queue.add(i);
        }
//        ѭ������  ���������  ��numCourses--
        while(!queue.isEmpty()){
            int pre=queue.poll();
            numCourses--;
            for(int cur:adjacency.get(pre)){
                indegrees[cur]--;
                if(indegrees[cur]==0) queue.offer(cur);
            }
        }
//        �ж��Ƿ�Ϊ0 ���ؽ��
        return numCourses==0;



    }
}
