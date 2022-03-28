package 通用算法包;

/**
 * @author lusir
 * @date 2022/3/27 - 22:28
 **/
public class pileSort2 {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        buildHeap(nums,n);
        int tmp;
        for(int i=n-1;i>=0;i--) {
            swap(nums,0,i);
            shift(nums,0,i);
        }
        return nums;
    }

    public void buildHeap(int nums[],int heapSize) {
        for(int i=heapSize/2;i>=0;i--){
            shift(nums,i,heapSize);
        }
    }

    public void shift(int nums[],int low,int height) {
        int i=2*low+1;
        int j=i+1;
        int largest=low;
        if (i<height&&nums[largest]<nums[i]) {
            largest=i;
        }
        if (j<height&&nums[largest]<nums[j]) {
            largest=j;
        }
        if (largest!=low) {
            swap(nums,low,largest);
            shift(nums,largest,height);
        }

    }

    public void  swap(int nums[],int i,int j) {
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
