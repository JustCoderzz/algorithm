package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/16 - 23:04
 **/
public class _695 {

    public int maxAreaOfIsland(int[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                  res=Math.max(res,dfs(grid,i,j));
                }
            }
        }
        return res;
    }


    public  int dfs(int [][]grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0) return 0;
        grid[i][j]=0;
        int n=1;

        n+=dfs(grid,i,j+1);
        n+=dfs(grid,i+1,j);
        n+=dfs(grid,i-1,j);
        n+=dfs(grid,i,j-1);
        return n;
    }

}
