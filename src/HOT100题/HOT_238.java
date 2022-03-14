package HOT100Ìâ;

/**
 * @author lusir
 * @date 2021/11/29 - 15:38
 **/
public class HOT_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        res[0]=1;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            res[i]=sum;
            sum=sum*nums[i];
        }
        sum=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            res[i]*=sum;
            sum*=nums[i];
        }
        return res;
    }
}
