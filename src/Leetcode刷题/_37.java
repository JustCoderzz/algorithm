package Leetcode刷题;

/**
 * @author lusir
 * @date 2022/4/11 - 13:57
 **/
public class _37 {
    public void solveSudoku(char[][] board) {
        trace(board,board.length);
    }

    public boolean trace(char[][]chars,int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (chars[i][j]!='.') continue;
                for (char c='1';c<='9';c++) {
                    if (valid(i,j,n,chars,c)) {
                        chars[i][j]=c;
                        if (trace(chars,n)) return true;
                        chars[i][j]='.';
                    }
                }
                return  false;
            }
        }
        return true;
    }


    public boolean valid(int row,int col,int n,char[][]chars,char c) {
//        检查同一行
        for (int i = 0; i < n; i++) {
            if (chars[row][i]==c) return false;
        }
//        检查同一列
        for (int i = 0; i < n; i++) {
            if (chars[i][col]==c) return false;
        }
//        检查同一个九宫格
        int rowStart=(row/3)*3;
        int colStart=(col/3)*3;
        for (int i=rowStart;i<rowStart+3;i++) {
            for (int j=colStart;j<colStart+3;j++) {
                if (chars[i][j]==c) return false;
            }
        }
        return true;
    }
}
