package HOT100Ìâ;

/**
 * @author lusir
 * @date 2021/11/5 - 12:05
 **/
public class HOT_494 {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
       backtrack(nums,target,0,0);
        return count;
    }

    public  void backtrack(int []nums,int target,int sum,int startIndex){
        if(startIndex==nums.length){
            if(sum==target){
                count++;
            }
        }else {
            sum+=nums[startIndex];
            backtrack(nums,target,sum,startIndex+1);
            sum-=nums[startIndex];
            sum-=nums[startIndex];
            backtrack(nums,target,sum,startIndex+1);
            sum+=nums[startIndex];
        }



    }

}
