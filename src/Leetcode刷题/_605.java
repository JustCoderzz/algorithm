package Leetcodeˢ��;

/**
 * @author lusir
 * @date 2022/2/24 - 13:06
 **/
public class _605 {
    //����������   ��Ϊ1�����Ҫ������  ��ǰһ��һ��Ϊ0 ���ֻ��Ҫ�жϺ�һ���Ƿ�Ϊ0����
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length&&n>0;){
            if(flowerbed[i]==1){
                i+=2;
            }else if(i==flowerbed.length-1||flowerbed[i+1]==0){
                n--;
                i+=2;
            }else{
                i+=3;
            }
        }
        return n<=0;
    }
}
