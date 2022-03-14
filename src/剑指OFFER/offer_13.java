package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/8 - 15:09
 **/
public class offer_13 {
//    效率比我的快很多
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(visited, m, n, k, 0, 0);
    }

    private int dfs(boolean[][] visited, int m, int n, int k, int i, int j) {
        if(i >= m || j >= n || visited[i][j] || bitSum(i) + bitSum(j) > k) return 0;
        visited[i][j] = true;
        return 1 + dfs(visited, m, n, k, i + 1, j) + dfs(visited, m, n, k, i, j + 1) ;
    }

    private int bitSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
//    public int movingCount(int m, int n, int k) {
//        boolean[][]visited=new boolean[m][n];
//        return dfs(visited,m,n,k,0,0);
//
//    }
//
//    public int dfs(boolean[][] visited,int m,int n,int k,int i,int j){
//        if(i>m-1||j>n-1||!canArrive(i,j,k)||visited[i][j]) return 0;
//        visited[i][j]=true;
//        return 1+dfs(visited,m,n,k,i+1,j)+dfs(visited,m,n,k,i,j+1);
//    }
//
//
//
//    public boolean canArrive(int m,int n,int k){
//        String str=m+""+n;
//        int sum=0;
//        for(int i=0;i<str.length();i++){
//            sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
//        }
//        System.out.println(sum);
//        return sum>k?false:true;
//    }
}
