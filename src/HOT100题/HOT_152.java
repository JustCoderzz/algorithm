package HOT100Ã‚;

/**
 * @author lusir
 * @date 2022/2/27 - 11:01
 **/
public class HOT_152 {
    public int maxProduct(int[] nums) {
//
//        if(nums.length==1) return nums[0];
//
//        int max=nums[0];
//        int []dp=new int[nums.length+1];
//        dp[1]=nums[0];
//        for(int i=2;i<=nums.length-1;i++){
//            if(nums[i]>=0){
//                dp[i]=Math.max(dp[i-1]*nums[i-1],nums[i-1]);
//            }else{
//                int m=dp[i-1]*nums[i-1];
//                int n=nums[i-1];
//                dp[i]=Math.abs(m)>Math.abs(n)?m:n;
//            }
//            max=Math.max(max,dp[i]);
//        }
//        dp[nums.length]=Math.max(dp[nums.length-1]*nums[nums.length-1],nums[nums.length-1]);
//        max=Math.max(max,dp[nums.length]);
//        return max;
        int maxF=nums[0];
        int minF=nums[0];
        int res=nums[0];
        int length=nums.length;
        for(int i=1;i<length;i++){
            int mxf=maxF;
            int mnf=minF;
            maxF=Math.max(mxf*nums[i],Math.max(nums[i],mnf*nums[i]));
            minF=Math.min(mnf*nums[i],Math.min(nums[i],mxf*nums[i]));
            res=Math.max(res,maxF);
        }
        return res;
    }
}
