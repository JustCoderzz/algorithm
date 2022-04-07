package 公司真题.腾讯音乐互娱;

/**
 * @author lusir
 * @date 2022/4/8 - 0:34
 **/
public class _4_7_1 {
    public static int numsOfStrings (int n, int k) {
        long res=0;
        for (int i=2;i<=(n-(k-1)*2);i++) {
            long tmp=26;
            for (int j=1;j<k;j++) {
                tmp=(tmp*25)%1000000;
            }
            res=(res+tmp)%1000000;
        }
        return (int) res;
    }
}
