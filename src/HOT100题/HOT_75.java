package HOT100题;

import java.util.Collections;

/**
 * @author lusir
 * @date 2021/12/2 - 9:42
 **/
public class HOT_75 {
    public void sortColors(int[] nums) {
//        双指针做法
        int p0=0;
        int p1=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1) swap(nums,i,p1++);
            if(nums[i]==0){
                swap(nums,i,p0);
                if(p0<p1) swap(nums,i,p1);
                p0++;
                p1++;
            }
        }
    }

    public  void swap(int nums[],int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
