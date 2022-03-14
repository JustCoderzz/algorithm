package HOT100Ìâ;

import java.util.Collections;

/**
 * @author lusir
 * @date 2021/11/30 - 15:06
 **/
public class HOT_31 {
    public void nextPermutation(int[] nums) {
        int firstIndex=-1;
        int secondIndex=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                firstIndex=i;
                break;
            }
        }
        if(firstIndex==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>=0;i--){
            if (nums[i]>nums[firstIndex]){
                secondIndex=i;
                break;
            }
        }
        swap(nums,firstIndex,secondIndex);
        reverse(nums,firstIndex+1,nums.length-1);
    }

    public void swap(int [] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
    public void reverse(int []nums,int i,int j){
        while(i<j){
            swap(nums,i++,j--);
        }
    }
}
