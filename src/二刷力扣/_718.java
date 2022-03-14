package 二刷力扣;

/**
 * @author lusir
 * @date 2022/3/4 - 15:15
 **/
public class _718 {
    public  int findLength(int[] num1,int [] num2){
        //dp[i][j]代表的是i下标  j下标结尾以前的最长重复子数组
        int res=1;
        int [][]dp=new int[num1.length+1][num2.length+1];

        for(int i=1;i< num1.length;i++){
            for(int j=1;j<num2.length;j++){
                if (num1[i]==num2[j]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                res=Math.max(res,dp[i][j]);
            }
        }
        return res;
    }
}
