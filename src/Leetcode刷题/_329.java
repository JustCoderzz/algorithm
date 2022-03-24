package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/23 - 23:58
 **/
public class _329 {

    int [][]matrix;
    int[][]visited;
    public int longestIncreasingPath(int[][] matrix) {
        this.matrix=matrix;
        visited=new int[matrix.length][matrix[0].length];
        int res=1;
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(visited[i][j]==0){
                 res=Math.max(res,dfs(i,j,Integer.MIN_VALUE));
                }
            }
        }
        return res;
    }

    public  int dfs(int i,int j,int pre){
        if(i<0||j<0||i>=matrix.length||j>=matrix[0].length||matrix[i][j]<=pre) return 0;
        if(visited[i][j]!=0) return visited[i][j];
        int max=Math.max(dfs(i+1,j,matrix[i][j]),Math.max(dfs(i-1,j,matrix[i][j]),
                Math.max(dfs(i,j+1,matrix[i][j]),dfs(i,j-1,matrix[i][j]))))+1;
        visited[i][j]=max;
        return max;
    }
}
