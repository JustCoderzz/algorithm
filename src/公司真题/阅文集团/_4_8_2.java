package 公司真题.阅文集团;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2022/4/8 - 21:08
 **/
public class _4_8_2 {

    boolean[] visited;
    int K;
    public boolean canPartitionKSubsets (int[] nums, int k) {

        int sum=0;
        for (int num:nums) {
            sum+=num;
        }
        int n=nums.length;
        K=k;
        if (sum%k!=0) return false;
        int avg=sum/k;
        Arrays.sort(nums);
        visited=new boolean[n];

        return trace(nums,0,0,avg);
    }

    public boolean trace(int []nums,int count,int sum,int avg) {
        if (count==K){
            return true;
        }
        for (int i=0;i<nums.length;i++) {
            if (visited[i]) continue;
            if ((sum+nums[i])==avg) {
                visited[i]=true;
                if(trace(nums,count+1,0,avg)) return true;
                visited[i]=false;
            }else if ((sum+nums[i])>avg){
                break;
            }else{
                visited[i]=true;
                if(trace(nums,count,sum+nums[i],avg)) return true;
                visited[i]=false;
            }

        }
        return false;
    }
}
