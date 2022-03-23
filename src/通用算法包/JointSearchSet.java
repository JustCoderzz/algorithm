package 通用算法包;

/**
 * @author lusir
 * @date 2022/3/22 - 11:15
 **/
public class JointSearchSet {

    public Boolean main(int nums[]){
        int []parent=new int[nums.length];
        int []rank=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            parent[i]=-1;
            rank[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            if(union(i,nums[i],parent,rank)==false) {
                System.out.println("Cycle Detected");
                return false;
            }
        }
        System.out.println("No Cycle!");
        return true;

    }

    public int find(int x,int []parent){
//        查找x的根节点
        int x_root=x;
        while(parent[x_root]!=-1){
            x_root=parent[x_root];
        }
        return x_root;
    }

    public Boolean union(int x,int y,int []parent,int []rank){
//        合并两个节点
        int x_root=find(x,parent);
        int y_root=find(y,parent);
        if(x_root==y_root) return false;
        else{
            if (rank[x_root]>rank[y_root]){
                parent[y_root]=x_root;
            }else if(rank[x_root]<rank[y_root]){
                parent[x_root]=y_root;
            }else{
                parent[x_root]=y_root;
                rank[y_root]++;
            }
            return true;
        }
    }


}
