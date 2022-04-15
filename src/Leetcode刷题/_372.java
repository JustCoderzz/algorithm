package LeetcodeË¢Ìâ;

import com.sun.org.apache.xpath.internal.operations.Mod;

/**
 * @author lusir
 * @date 2022/4/15 - 10:59
 **/
public class _372 {
    int MOD=1337;
    public int superPow(int a, int[] b) {
        return dfs(a,b,b.length-1);
    }
    int dfs(int a,int []b,int index) {
        if (index==-1) return 1;
        return quickPow(dfs(a,b,index-1),10)*quickPow(a,b[index])%MOD;
    }

    public int quickPow(int a,int n) {
        a=a%MOD;
        int res=1;
        while (n>0) {
            if ((n&1)==1) res=(res*a)%MOD;
            a=a*a%MOD;
            n>>=1;
        }
        return res;
    }
}
