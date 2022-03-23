package LeetcodeË¢Ìâ;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2022/3/23 - 10:53
 **/
public class _135 {

        public int candy(int[] ratings) {

                int candy[] =new int[ratings.length];

                Arrays.fill(candy,1);
                int count=0;
                for(int i=1;i<ratings.length;i++){
                        if(ratings[i]>ratings[i-1]){
                                candy[i]=candy[i-1]+1;
                        }
                }
                for(int i=ratings.length-2;i>=0;i--){
                        if(ratings[i]>ratings[i+1]){
                                candy[i]=Math.max(candy[i],candy[i+1])+1;
                        }
                }
                for(int i:candy){
                        count+=i;
                }
                return count;






        }
}
