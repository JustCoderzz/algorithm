package _360笔试;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/20 - 10:21
 **/
public class FindBlackPieces {
//    寻找黑色棋子   二维数组每一行都代表 一个区间    也就是对该区间的棋子进行反转
//    100 2
//    1   30
//    21   40
//    30    50
//    输出   70  70

    public int[]  find(int nums[][],int n){
//        n代表初始有多少个黑色棋子

        List<int []> list=new ArrayList<>();
        list.add(new int[]{1,n});
        int []res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int []pre=nums[i];
            int count=0;
            Iterator<int[]> iterator = list.iterator();
            while (iterator.hasNext()){
                int[] cur=iterator.next();
                iterator.remove();
//                判断交集情况
                if(pre[1]>cur[0]&&pre[1]<cur[1]&&pre[0]<cur[0]){
                    list.add(new int[]{pre[1]+1,cur[1]});
                    count+=cur[1]-pre[1];
                    pre[1]=cur[0]-1;
                }else if(pre[1]<=cur[1]&&pre[0]>=cur[0]){
                    list.add(new int[]{pre[1]+1,cur[1]});
                    list.add(new int[]{cur[0],pre[0]-1});
                    count+=pre[0]-cur[0];
                    count+=cur[1]-pre[1];
                    break;
                }else if (cur[1]>pre[0]&&cur[1]<pre[1]&&cur[0]<pre[0]){
                    list.add(new int[]{cur[0],pre[0]-1});
                    count+=pre[0]-cur[0];
                    pre[0]=cur[1]+1;
                }else if(cur[1]<pre[1]&&cur[0]>pre[0]){
                    list.add(new int[]{cur[1]+1,pre[1]});
                    count+=pre[1]-cur[1];
                    list.add(new int[]{pre[0],cur[0]-1});
                    count+=cur[0]-pre[0];
                    break;
                }
            }
            if(pre[0]!=pre[1]&&pre[0]<pre[1]) list.add(pre);
            count+=pre[1]-pre[0];
            res[i]=count;
        }
        return res;

    }
}
