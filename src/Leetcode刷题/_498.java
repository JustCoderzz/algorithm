package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/3/22 - 23:04
 **/
public class _498 {


    public int[] findDiagonalOrder(int[][] mat) {

        int n= mat.length*mat[0].length;
        int flag=1;
        int [] res=new int[n];
        int count=0;
        int i=0;
        int j=0;
        while(count<n){
            if((flag&1)==1){
                while (isTrue(i,j,mat)) {
                    res[count++]=mat[i][j];
                    i=i-1;
                    j=j+1;
                }
                flag++;
                if(isTrue(++i,j,mat)){
                    continue;
                }
                i=i+1;
                j=j-1;
            }else{
                while (isTrue(i,j,mat)){
                    res[count++]=mat[i][j];
                    i=i+1;
                    j=j-1;
                }
                flag++;
                if(isTrue(i,++j,mat)){
                    continue;
                }
                i=i-1;
                j=j+1;
            }
        }
        return res;
    }
    public  Boolean isTrue(int i,int j,int[][]mat){
        if (i<0||j<0||i>=mat.length||j>=mat[0].length) return false;
        else return true;
    }



}
