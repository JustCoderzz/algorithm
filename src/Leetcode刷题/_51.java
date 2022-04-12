package Leetcode刷题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lusir
 * @date 2022/4/11 - 13:27
 **/
public class _51 {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {

        char[][]chars=new char[n][n];
        for (char[] item:chars){
            Arrays.fill(item,'.');
        }
        trace(chars,n,0);
        return res;
    }

    public void trace(char[][] chars,int n,int row) {
        if (n==row) {
            res.add(processStr(chars));
            return;
        }
        for (int col=0;col<n;col++) {
            if (valid(chars,row,col,n)){
                chars[row][col]='Q';
                trace(chars,n,row+1);
                chars[row][col]='.';
            }
        }

    }

    public List<String>  processStr(char[][] chars) {
        List<String> list=new ArrayList<>();
        for (char[] tmp:chars){
            list.add(String.copyValueOf(tmp));
        }
        return list;
    }

    public boolean valid(char[][] chars,int row,int col,int n) {
//        检查同一列
        for (int i = 0; i < row; i++) {
            if (chars[i][col]=='Q'){
                return false;
            }
        }
//        检查斜左上方
        for (int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {
            if (chars[i][j]=='Q') return false;
        }
//        检查斜右上方
        for (int i=row-1,j=col+1;i>=0&&j<n;i--,j++) {
            if (chars[i][j]=='Q') return false;
        }
        return true;
    }
}
