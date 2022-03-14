package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/7 - 16:02
 **/
public class Code_213 {
    public int rob(int[] nums) {
//        考虑有环的情况 则有不偷第一间房子 和不偷最后一间房子  两种情况
        if(nums==null||nums.length==0){
            return 0;
        }
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(robAction(nums,0,n-1),robAction(nums,1,n));

    }
//    打家劫舍的逻辑
    int robAction(int[]nums,int start,int end){
        int x=0;//x,y,z分别代表存储第1，2，3个数
        int y=0;
        int z=0;
        for(int i=start;i<end;i++){
            y=z;
            z=Math.max(y,x+nums[i]);
            x=y;
        }
        return z;
    }
}
