package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/3/28 - 11:41
 **/
public class _693 {
    int flag;
    public boolean hasAlternatingBits(int n) {
        flag=n&1;
        n=n>>1;
        return dfs(n);

    }
    public boolean dfs(int n) {
        if (n==0) return true;
        if (((n&1)^flag)==1) {
            flag=n&1;
            n=n>>1;
            return dfs(n);
        }
        return false;
    }
}
