package Leetcode刷题;

/**
 * @author lusir
 * @date 2022/2/24 - 13:06
 **/
public class _605 {
    //跳格子做法   若为1则必须要调两格  且前一个一定为0 因此只需要判断后一个是否为0即可
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
