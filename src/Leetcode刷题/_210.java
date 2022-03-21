package Leetcodeˢ��;

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
//        �����ڽӱ�
        List<List<Integer>> adjList=new ArrayList<>();
//        ������ȱ�
        int [] orders=new int[numCourses];
//        ��ʼ���ڽӱ�
        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }
//        ��������
        for(int i=0;i<prerequisites.length;i++){
            orders[prerequisites[i][0]]++;
            adjList.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
//        �������
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(orders[i]==0){
                queue.offer(i);
            }
        }
//        �������˳��
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
