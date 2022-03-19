package ¶þË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/3/17 - 20:23
 **/
public class _215 {
    public  int findKthLargest(int []nums,int k){
        int n=nums.length;
        buildMaxHeap(nums,n);
        int tmp;
        for(int i=n-1;i>=n-k+1;i--){
            tmp=nums[0];
            nums[0]=nums[i];
            nums[i]=tmp;
            shift(nums,0,i);
        }

        return nums[0];
    }


    public void buildMaxHeap(int []nums,int heapSize){
        for(int i=heapSize/2;i>=0;i--){
            shift(nums,i,heapSize);
        }
    }

    public  void shift(int []a,int i,int heapSize){
        int l=2*i+1;
        int r=l+1;
        int largest=i;
        if(l<heapSize&&a[l]>a[largest]){
            largest=l;
        }
        if(l<heapSize&&a[r]>a[largest]){
            largest=r;
        }
        if(largest!=i){
            swap(a,i,largest);
            shift(a,largest,heapSize);
        }


    }
    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
