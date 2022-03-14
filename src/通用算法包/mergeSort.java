package 通用算法包;

/**
 * @author lusir
 * @date 2022/3/7 - 0:12
 **/
public class mergeSort {
    public  void  sort(int nums[],int left,int right){
        int mid=(left+right)/2;
        sort(nums,0,mid-1);
        sort(nums,mid,right);

    }

    public  void merge(int nums,int left,int mid,int right){

    }
}
