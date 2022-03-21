package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/3/21 - 15:53
 **/
public class _440 {
    public int findKthNumber(int n, int k) {
        long cur=1;
        k-=1;
        while (k>0){
            int total=getNodes(cur,n);
            if(k>=total){
                k-=total;
                cur++;
            }else{
                k--;
                cur*=10;
            }
        }
        return (int)cur;


    }


    public int getNodes(long cur, int n){
        long next=cur+1;
        long total=0;
        while(cur<=n){
            total+=Math.min(next-cur,n-cur+1);
            cur*=10;
            next*=10;
        }
        return (int)total;
    }
}
