package 力扣周赛;

/**
 * @author lusir
 * @date 2022/3/20 - 11:45
 **/
public class _3 {
    public int[] maximumBobPoints(int numArrows, int[] aliceArrows) {
//        数组区域为11  尽可能的获得更多的分数
//        背包容量  numArrows
//        物品   aliceArrows
//        在容量一定的情况下  获取最大的物品
//        dp[i][j]代表的是物品下标0-i 装进容量为j的背包  最大的价值
        int[] res=new int[aliceArrows.length];

        int [][]dp=new int[aliceArrows.length+1][numArrows+1];
        for(int i=1;i<=aliceArrows.length;i++){
            for(int j=1;j<=numArrows;j++){
                if(j<aliceArrows[i-1]+1){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-aliceArrows[i-1]]+i-1);
                }
            }
        }
        int c=numArrows;
        for(int i=aliceArrows.length;i>=1;i--){
                if(dp[i][c]==dp[i-1][c]){
                    res[i-1]=0;
                }else{
                        res[i-1]=aliceArrows[i-1]+1;
                        c-=aliceArrows[i-1]+1;
            }
        }

        return res;
    }
}
