package LeetcodeË¢Ìâ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/2 - 22:19
 **/
public class _15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) continue;
            if(i>0&&nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0) {
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r&&nums[l]==nums[l+1]) l++;
                    while(l<r&&nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }else if(sum>0){
                    r--;
                }else {
                    l++;
                }

            }

        }
        return res;
    }
}
