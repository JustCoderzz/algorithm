package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/3/8 - 22:55
 **/
public class _215 {
    public  int findKthLargest(int[]nums,int k){
        sort(nums,nums.length-1,k);
        return nums[0];


    }

    public  void shift(int []nums,int low,int height){
        int i=low+1;
        int j=2*i;
        int tmp=nums[i];
        while (j<=height){
            if(j<height&&nums[i]<nums[j]){
                j++;
            }
            if(nums[j]>tmp){
                nums[i]=nums[j];
                i=j;
                j=2*i;
            }else break;
        }
        nums[i]=tmp;
    }
    public  void sort(int[] nums,int n,int k){
        int tmp;
        for(int i=n/2;i>=0;i--){
            shift(nums,i,n);
        }

        for(int i=n;i>n-k;i--){
            tmp=nums[1];
            nums[1]=nums[i];
            nums[i]=tmp;
            shift(nums,1,i-1);


        }
    }
}
