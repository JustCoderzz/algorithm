package LeetcodeÀ¢Ã‚;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2022/4/5 - 12:21
 **/
public class _875 {
    public int minEatingSpeed(int[] piles, int h) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for( int i : piles) {
            sum+=i;
            max=Math.max(max,i);
        }
        int K=0;
        int avg= sum/h;
        int L=avg;
        int R=max;
        while (L<=R) {
            int mid=(L+R)/2;
            if (MeetCondition(mid,piles,h)){
                K=mid;
                R=mid-1;
            }else {
                L=mid+1;
            }
        }
        return K;

    }

    public boolean MeetCondition(int speed,int []piles,int h) {
        for (int pile:piles) {
            h-=(pile+speed-1)/speed;
        }
        if (h<0) return false;
        else  return  true;
    }
}
