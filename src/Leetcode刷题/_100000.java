package LeetcodeË¢Ìâ;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/4/29 - 16:53
 **/
public class _100000 {
    public List<List<Integer>> solution(int nums[]) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i>0&&nums[i]==nums[i-1]) continue;
            int aNum=nums[i];
            int j=i+1;
            int k=n-1;
            while (j<k) {
                int bNum=nums[j];
                int cNum=nums[k];
                int sum=aNum+bNum+cNum;
                if (sum==0) {
                    List<Integer> list=new ArrayList<>();
                    list.add(aNum);
                    list.add(bNum);
                    list.add(cNum);
                    res.add(list);
                    while (j<k&&nums[k-1]==nums[k]) k--;
                    while (j<k&&nums[j+1]==nums[j]) j++;
                }else if (sum<0) {
                    j++;
                }else k--;
            }
        }
        return res;
    }
}
