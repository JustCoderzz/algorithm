package 通用算法包;

/**
 * @author lusir
 * @date 2022/3/31 - 13:46
 **/
public class SegmentTree {
    /**
     * 线段树
     * @param arr   原数组
     * @param tree   构造的树
     * @param node    当前节点
     * @param start    区间开始
     * @param end      区间结束
     */

    void buildTree(int arr[],int tree[],int node,int start,int end) {
        if (start==end) {
            tree[node]=arr[start];
        }else{
            int mid=(start+end)/2;
            int left_node=2*node+1;
            int right_node=2*node+2;
            buildTree(arr,tree,left_node,start,mid);
            buildTree(arr,tree,right_node,mid+1,end);
            tree[node]=tree[left_node]+tree[right_node];
        }
    }

    void update(int arr[],int tree[],int node,int start,int end,int idx,int val) {
        if (start==end) {
            arr[idx]=val;
            tree[node]=val;
        }else{
            int mid=(start+end)/2;
            int left_node=2*node+1;
            int right_node=2*node+2;
            if (idx>=start&&idx<=mid) {
                update(arr,tree,left_node,start,mid,idx,val);
            }else if (idx>mid&&idx<=end) {
                update(arr,tree,right_node,mid+1,end,idx,val);
            }
            tree[node]=tree[left_node]+tree[right_node];
        }
    }

    int query_tree(int arr[],int tree[],int node,int start,int end,int L,int R) {
        if (end<L||start>R) {
            return 0;
        }else if (start>=L&&end<=R) {
            return tree[node];
        }else {
            int mid=(start+end)/2;
            int left_node=2*node+1;
            int right_node=2*node+2;
            int sum_left=query_tree(arr,tree,left_node,start,mid,L,R);
            int sum_right=query_tree(arr,tree,right_node,mid+1,end,L,R);
            return sum_left+sum_right;
        }

    }
}
