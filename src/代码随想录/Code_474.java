package ��������¼;

/**
 * @author lusir
 * @date 2021/12/6 - 10:15
 **/
public class Code_474 {
    public int findMaxForm(String[] strs, int m, int n) {
//        dp[i][j]�������i��0��j��1����Ӽ��ĳ���
        int [][]dp=new int[m+1][n+1];
        int oneNum,zeroNum;
        for(String str:strs){

            oneNum=0;
            zeroNum=0;
            for(char c:str.toCharArray()){
                if (c=='0') zeroNum++;
                else oneNum++;
            }

            for(int i=m;i>=zeroNum;i--){
                for(int j=n;j>=oneNum;j--){
                    dp[i][j]=Math.max(dp[i][j],dp[i-zeroNum][j-oneNum]+1);
                }
            }
        }
        return dp[m][n];
    }
}
