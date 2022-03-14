package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/10 - 21:33
 **/
public class offer_57 {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int []res=new int[2];
        while(i<j){
            int tmp=nums[i]+nums[j];
            if(tmp>target){
                j--;
            }else if(tmp<target){
                i++;
            }else {
                res[0]=nums[i];
                res[1]=nums[j];
                break;
            }
        }
        return res;
    }
}
