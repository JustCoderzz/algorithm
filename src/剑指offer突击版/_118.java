package ½£Ö¸offerÍ»»÷°æ;

/**
 * @author lusir
 * @date 2022/3/30 - 23:33
 **/
public class _118 {
    public int[] findRedundantConnection(int[][] edges) {
            int n=edges.length;
            int []parent=new int[n+1];
            int []rank=new int[n+1];
            for (int i=1;i<=n;i++) {
                parent[i]=i;
                rank[i]=0;
            }
            for (int i=0;i<n;i++) {
                int []pre=edges[i];
                int x=pre[0];
                int y=pre[1];
                if (find(parent,x)!=find(parent,y)){
                    union(x,y,parent,rank);
                }else {
                    return  pre;
                }
            }
            return new int[0];
    }

    public int find(int[]parent,int num) {
        if (parent[num]!=num){
            parent[num]=find(parent,parent[num]);
        }
        return parent[num];
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
