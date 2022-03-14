package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/21 - 10:02
 **/
public class offer_53_I {
    public int search(int[] nums, int target) {
        return count(nums,target,0,nums.length-1);

    }
    public  int count(int []nums,int target,int left,int right){
        if(left>right){
            return 0;
        }
        int mid=left+(right-left)/2;
        if(nums[mid]<target){
            return count(nums,target,mid+1,right);
        }else if(nums[mid]>target){
            return count(nums,target,left,mid-1);
        }else{
            return 1+count(nums,target,mid+1,right)+count(nums,target,left,mid-1);
        }
    }
}
