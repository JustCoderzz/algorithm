package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/17 - 8:46
 **/
public class offer_12 {
    public boolean exist(char[][] board, String word) {
//        参看K神
        char [] words=word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,words,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][]board,char []words,int i,int j,int k){
        if(i<0||i>board.length-1||j<0||j>board[0].length-1||board[i][j]!=words[k])return false;
        if(k==words.length-1) return true;
        board[i][j]='\0';
        boolean res=dfs(board,words,i+1,j,k+1)||dfs(board,words,i,j+1,k+1)||
                dfs(board,words,i-1,j,k+1)||dfs(board,words,i,j-1,k+1);
        board[i][j]=words[k];
        return  res;
    }
}
