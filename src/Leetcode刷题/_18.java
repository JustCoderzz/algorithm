package LeetcodeË¢Ìâ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lusir
 * @date 2022/4/14 - 14:31
 **/
public class _18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        for (int i = 0; i < n-3; i++) {
            if (i!=0&&nums[i]==nums[i-1]) continue;
            int a=nums[i];
            for (int j = i+1; j < n-2; j++) {
                if (j!=(i+1)&&nums[j]==nums[j-1]) continue;
                int b=nums[j];
                int k=j+1;
                int l=n-1;
                int sum=a+b;
                while (k<l) {
                    if (sum+nums[k]+nums[l]==target) {
                        List<Integer> list=new ArrayList<>();
                        list.add(a);list.add(b);list.add(nums[k]);list.add(nums[l]);
                        res.add(list);
                        while (k<l&&nums[k]==nums[k+1]) k++;
                        while (k<l&&nums[l]==nums[l-1]) l--;
                        k++;
                        l--;
                    }else if (sum+nums[k]+nums[l]>target) {
                        l--;
                    }else{
                        k++;
                    }
                }
            }
        }
        return res;
    }
}
