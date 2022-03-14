package HOT100Ìâ;

/**
 * @author lusir
 * @date 2022/2/26 - 22:56
 **/
public class Hot_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length;
        while(true){
            if(i>=matrix.length||j<0) break;
            if(matrix[i][j]>target){
                j--;
            }else if(matrix[i][j]<target){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
}
