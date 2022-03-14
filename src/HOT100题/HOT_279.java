package HOT100题;

/**
 * @author lusir
 * @date 2021/11/29 - 10:04
 **/
public class HOT_279 {
    public int numSquares(int n) {

        int[]fn=new int[n+1];//和为i的完全平方数的最少和
        for(int i=1;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){//完全平方出现的最大可能  枚举所有的完全平方数，来进行迭代 然后选择出现最少数量的
                min=Math.min(min,fn[i-j*j]);

            }
            fn[i]=min+1;
        }
        return fn[n];

    }
}
