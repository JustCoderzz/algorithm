package LeetcodeË¢Ìâ;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2022/3/3 - 21:27
 **/
public class _16 {
    public  int threeSumClosest(int[] nums,int target){
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(Math.abs(sum-target)<Math.abs(res-target)) res=sum;
                if(sum>target){
                    r--;
                }else if(sum==target){
                    return res;
                }else{
                    l++;
                }
            }
        }
        return res;
    }
}
