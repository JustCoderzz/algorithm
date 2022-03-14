package HOT100题;

/**
 * @author lusir
 * @date 2021/11/28 - 10:41
 **/
public class Hot_62 {
    public int uniquePaths(int m, int n) {
//        fn[i][j]表示的是去arr[i][j]
        int[][] fn=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0){
                    fn[i][j]=1;
                }else{
                    fn[i][j]=fn[i-1][j]+fn[i][j-1];
                }

            }
        }
        return fn[m-1][n-1];
    }
}
