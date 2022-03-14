package Leetcodeˢ��;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/9 - 20:39
 **/
public class _54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left=0;
        int right=matrix[0].length;
        int top=0;
        int bottom=matrix.length;
        boolean[][]used=new boolean[matrix.length][matrix[0].length];
        int i=0;
        int j=0;
        List<Integer> res=new ArrayList<>();
        while(true){
            if(res.size()==right*bottom) break;
//            ������
            while(j<right&&used[i][j]!=true){
                res.add(matrix[i][j]);
                used[i][j]=true;
                j++;
            }
            j--;
            i++;
//            ���ϵ���
            while (i<bottom&&used[i][j]!=true){
                res.add(matrix[i][j]);
                used[i][j]=true;
                i++;
            }
            i--;
            j--;
//            ���ҵ���
            while (j>=left&&used[i][j]!=true){
                res.add(matrix[i][j]);
                used[i][j]=true;
                j--;
            }
            j++;
            i--;
            while(i>=top&&used[i][j]!=true){
                res.add(matrix[i][j]);
                used[i][j]=true;
                i--;
            }
            i++;
            j++;
        }
        return res;
    }
}
