package HOT100Ìâ;

/**
 * @author lusir
 * @date 2021/11/23 - 14:47
 **/
public class HOT_338 {
    public int[] countBits(int n) {
        int [] res=new int [n+1];
        res[0]=0;
        for(int i=1;i<n+1;i++){
            res[i]=res[i>>1]+(i&1);
        }
        return res;
    }
}
