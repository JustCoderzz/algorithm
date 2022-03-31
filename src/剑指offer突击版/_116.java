package ½£Ö¸offerÍ»»÷°æ;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lusir
 * @date 2022/3/31 - 0:02
 **/
public class _116 {
    boolean []flag;
    public int findCircleNum(int[][] isConnected) {

        int n=isConnected.length;
        int parent[]=new int[n+1];
        int rank[]=new int[n+1];
        flag=new boolean[n+1];
        for (int i=1;i<=n;i++){
            parent[i]=i;
            rank[i]=0;
        }
        for (int i=0;i<n;i++) {
            for (int j=i;j<n;j++) {
                if (isConnected[i][j]==1) {
                    union(i+1,j+1,parent,rank);
                }
            }
        }
        Set<Integer> res=new HashSet<>();
        for (int i=1;i<=n;i++){
            res.add(find(parent,i));
        }
        return res.size();

    }

    public int find(int[]parent,int x) {
        if (parent[x]!=x) {
//            flag[x]=true;
            parent[x]=find(parent,parent[x]);

        }
        return parent[x];
    }

    public void union(int x,int y,int[]parent,int rank[]) {
        if(rank[x]>rank[y]) {
            parent[find(parent,y)]=find(parent,x);
        }else if (rank[x]<rank[y]) {
            parent[find(parent,x)]=find(parent,y);
        }else {
            parent[find(parent,y)]=find(parent,x);
            rank[x]++;
        }
    }
}
