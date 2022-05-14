package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/12 - 19:47
 **/
public class _79 {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited=new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]==word.charAt(0)){
                    if (dfsBoard(board,i,j,0,word)) return true;
                }
            }
        }
        return false;
    }

    public boolean dfsBoard(char[][] board,int i,int j,int index,String word) {
        if (index==word.length()) return true;
        if (i<0||j<0||i>=board.length||j>=board[0].length
                ||board[i][j]!=word.charAt(index)||visited[i][j]==true)
            return false;
        visited[i][j]=true;
        if (dfsBoard(board,i+1,j,index+1,word) ||
            dfsBoard(board,i-1,j,index+1,word)||
            dfsBoard(board,i,j+1,index+1,word)||
            dfsBoard(board,i,j-1,index+1,word)) {
            return true;
        }
        visited[i][j]=false;
        return false;
    }
}
