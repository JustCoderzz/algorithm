package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/10/30 - 10:59
 **/
public class offer_04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

//        官方解答   该题类似于二叉排序树  右上角为根节点
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;





//        for(int i=0;i<matrix.length;i++){
//           if(Slice2(matrix[i],target)){
//               return true;
//           }
//        }
//
//
//        return false;
    }

//    对每一行进行二分查找
//    public boolean Slice2(int [] arr,int target){
//        int left=0;
//        int right=arr.length-1;
//        while(left<=right){
//            int mid=left+(right-left)/2;
//            if(target>arr[mid]){
//                left=mid+1;
//            }else if(target<arr[mid]){
//                right=mid-1;
//            }else{
//                return true;
//            }
//        }
//        return  false;
//    }
}
