package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/23 - 13:26
 **/
public class _134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasCount=0;
        int costCount=0;
        for(int i:gas){
            gasCount+=i;
        }
        for(int i:cost){
            costCount+=i;
        }
        if(gasCount<costCount) return -1;
        int n=gas.length;
        int []dic=new int[n];
        for(int i=0;i<n;i++){
            dic[i]=gas[i]-cost[i];
        }
        int maxIndex=-1;
        int maxV=Integer.MIN_VALUE;
        int cur=0;
        for(int i=n-1;i>=0;i--){
            cur+=dic[i];
            if(cur>maxV){
                maxV=cur;
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
