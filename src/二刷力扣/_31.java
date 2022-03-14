package ¶þË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/3/11 - 9:43
 **/
public class _31 {
    public  void nextPermutation(int []nums){
        int first=-1;
        int second=-1;
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i]>nums[i-1]){
                first=i-1;
                break;
            }
        }
        if(first==-1) {
            reverseArr(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>first;i--){
            if(nums[i]>nums[first]){
                second=i;
                break;
            }
        }
        swap(nums,first,second);
        reverseArr(nums,first+1,nums.length-1);
    }


    public  void reverseArr(int nums[],int i,int j){
        if(i>j) return;
        while(i<j){
            swap(nums,i++,j--);
        }
    }
    public  void swap(int []nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
