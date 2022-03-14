package HOT100Ìâ;

/**
 * @author lusir
 * @date 2021/11/5 - 16:42
 **/
public class HOT_11 {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length-1;
        int h=0;
        while(i!=j){
            h=Math.min(height[i],height[j]);
            max=Math.max((j-i)*h,max);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}
