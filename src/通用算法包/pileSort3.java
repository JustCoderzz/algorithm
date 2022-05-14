package 通用算法包;

/**
 * @author lusir
 * @date 2022/4/28 - 21:15
 **/
public class pileSort3 {

    public int[] sort(int nums[]) {
        int n=nums.length;
        build(nums,n);
        for (int i=n-1;i>=0;i--) {
            swap(nums,0,i);
            shift(nums,0,i);
        }
        return nums;
    }

    public void build(int[]nums,int height) {
        for (int i=height/2;i>=0;i--) {
            shift(nums,i,height);
        }
    }

    public void shift(int[]nums,int low,int height) {
        int i=2*low+1;
        int j=i+1;
        int largest=low;
        if (i<height&&nums[i]>nums[largest]){
            largest=i;
        }
        if (j<height&&nums[j]>nums[largest]){
            largest=j;
        }
        if (low!=largest) {
            swap(nums,low,largest);
            shift(nums,largest,height);
        }
    }

    public void swap(int[]nums,int i,int j) {
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
