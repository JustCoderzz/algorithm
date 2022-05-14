package Leetcode刷题;

/**
 * @author lusir
 * @date 2022/5/5 - 19:10
 **/
public class _74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
//        从最后一列中选择  找到大于等于最逼近的行坐标  若找到就直接返回true
        int col=n-1;
        int left=0;
        int right=m-1;
        int row=-1;
        while (left<=right){
            int mid=(right-left)/2+left;
            if (matrix[mid][col]==target) return true;
            else if (matrix[mid][col]>target){
                row=mid;
                right=mid-1;
            }else left=mid+1;
        }
        if (row!=-1) {
            left=0;
            right=n-1;
            while (left<=right) {
                int mid=(right-left)/2+left;
                if (matrix[row][mid]==target) return true;
                else if (matrix[row][mid]>target) right=mid-1;
                else left=mid+1;
            }
        }
        return false;
    }
}
