package 力扣周赛;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2022/4/3 - 11:32
 **/
public class _4_3_3 {
    public int maximumCandies(int[] candies, long k) {
//输出：
//141006
//预期：
//1000000
        long sum=0;
        for (int i:candies) {
            sum+=i;
        }
        Arrays.sort(candies);
        if (sum<k) return 0;
        int l=1;
        int r=(int)(sum/k);
        int res=0;
        while (l<=r) {
            int mid=(r-l)/2+l;
            long goal=k;
            for (int i=candies.length-1;i>=0;i--) {
                if (candies[i]<mid) break;
                goal-=candies[i]/mid;
            }
            if (goal>0){
                r=mid-1;
            }else if (goal<=0){
                res=mid;
                l=mid+1;
            }
        }
        return res;
    }
}
