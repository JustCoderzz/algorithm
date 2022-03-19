package ¶þË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/3/16 - 23:49
 **/
public class _79 {
    boolean[][]visited;
    char[][] board;
    public boolean exist(char[][] board,String word){
        this.board=board;
        visited=new boolean[board.length][board[0].length];
        char c=word.charAt(0);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==c){
                if(dfs(word,i,j,0)) return true;
                }
            }
        }
        return  false;
    }

    public  boolean dfs(String word,int i,int j,int index){
        if (index==word.length()) return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length) return false;
        if(visited[i][j]==false&&board[i][j]==word.charAt(index)){
            visited[i][j]=true;
            boolean flag=dfs(word,i,j+1,index+1)||dfs(word,i+1,j,index+1)
                    ||dfs(word,i,j-1,index+1)||dfs(word,i-1,j,index+1);
            visited[i][j]=false;
            return flag;
        }else{
            return false;
        }
    }
}
