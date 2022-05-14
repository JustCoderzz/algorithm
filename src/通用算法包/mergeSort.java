package 通用算法包;

/**
 * @author lusir
 * @date 2022/3/7 - 0:12
 **/
public class mergeSort {
    public  void  sort(int nums[],int left,int right){
        if (right>left) return;
        int mid=(right-left)>>1+left;
        sort(nums,0,mid);
        sort(nums,mid+1,right);
        merge(nums,left,mid,right);

    }

    public  void merge(int nums[],int left,int mid,int right){
        int[]help=new int[right-left+1];
        int p1=left;
        int p2=mid+1;
        int i=0;
        while (p1<=mid&&p2<=right) {
            help[i++]=nums[p1]<=nums[p2]?nums[p1++]:nums[p2++];
        }
        while (p1<=mid){
            help[i++]=nums[p1++];
        }
        while (p2<=right){
            help[i++]=nums[p2++];
        }
        for (int j = 0; j < help.length; j++) {
            nums[left+j]=help[j];
        }
    }
}
