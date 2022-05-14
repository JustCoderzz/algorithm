package ¶þË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/5/5 - 19:06
 **/
public class _367 {
    public boolean isPerfectSquare(int num) {
        int left=1;
        int right=num;
        while (left<=right) {
            int mid=(right-left)/2+left;
            if ((long)mid*mid==num) return true;
            else if ((long)mid*mid<num){
                left=mid+1;
            }else right=mid-1;
        }
        return false;
    }
}
