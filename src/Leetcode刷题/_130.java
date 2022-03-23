package LeetcodeÀ¢Ã‚;

import javax.swing.*;

/**
 * @author lusir
 * @date 2022/3/22 - 11:40
 **/
public class _130 {
        Boolean[][] flags;
        public void solve(char[][] board) {
            flags=new Boolean[board.length][board[0].length];
            for(int i=0;i<board.length;i++){
                for(int j=0;i<board[0].length;j++){
                    flags[i][j]=false;
                }
            }
            for(int i=0;i<board.length;i++){
                dfs(board,i,0);
                dfs(board,i,board[0].length-1);
            }
            for(int i=0;i<board[0].length;i++){
                dfs(board,0,i);
                dfs(board,board.length-1, i);
            }
            for(int i=0;i<board.length;i++){
                for(int j=0;i<board[0].length;j++){
                    if(flags[i][j]==false&&board[i][j]=='O'){
                        board[i][j]='X';
                    }
                }
            }
        }

        public void dfs(char[][] board,int i,int j){
            if(i>=board.length||i<0||j>=board[0].length||j<0||board[i][j]=='X'||flags[i][j]) return;
            flags[i][j]=true;
            dfs(board,i+1,j);
            dfs(board,i-1,j);
            dfs(board,i,j+1);
            dfs(board,i,j-1);
        }
}
