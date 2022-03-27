package ¡¶ø€÷‹»¸;

/**
 * @author lusir
 * @date 2022/3/27 - 10:29
 **/
public class _3_27_3 {
    public long[] kthPalindrome(int[] queries, int intLength) {
        /*
        *    10001
        *    10101
        *    10201
        *    10301
        * */

        long min=(long) Math.pow(10,(intLength-2+1)/2);
        long max=(long) Math.pow(10,(intLength+1)/2)-1;
        int n=queries.length;
        long []res=new long[n];
        for(int i=0;i<n;i++) {
            int num=queries[i];
            long cur=num-1+min;
            if (cur>max) {
                res[i]=-1;
                continue;
            }
            String str=""+cur;
            StringBuilder sb=new StringBuilder(str);
            if (intLength%2==0) {
                str+=sb.reverse().toString();
            }else {
                str+=sb.reverse().substring(1).toString();
            }
            res[i]=Long.parseLong(str);
        }
        return res;


    }


}
