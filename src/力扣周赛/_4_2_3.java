package Á¦¿ÛÖÜÈü;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/4/2 - 22:49
 **/
public class _4_2_3 {
//    public long res;
//    public long numberOfWays(String s) {
//        char[] chars = s.toCharArray();
//
//        backTrace(chars,0,new StringBuilder());
//        return res;
//    }
//
//    public void  backTrace(char[] chars,int index,StringBuilder sb) {
//        if (sb.length()==3) {
//            res++;
//            return;
//        }
//        if (index>=chars.length) return;
//
//        for (int i=index;i<chars.length;i++) {
//            if (sb.length()==0||chars[i]!=sb.charAt(sb.length()-1)){
//                sb.append(chars[i]);
//                backTrace(chars,i+1,sb);
//                sb.deleteCharAt(sb.length()-1);
//            }
//        }
//    }
//        public long numberOfWays(String s) {
//            char[] chars = s.toCharArray();
//            int n=chars.length;
//            int [][] arr=new int[n][2];
//            int _zero=0;
//            int _one=0;
//            for (int i=chars.length-1;i>=0;i--) {
//                arr[i]=new int[]{_zero,_one};
//                if (chars[i]=='1') _one++;
//                else _zero++;
//            }
//            long res=0;
//            for (int i=0;i<n;i++) {
//                char c=chars[i];
//                for (int j=i+1;j<n;j++) {
//                    if (chars[j]!=c) {
//                        if (chars[j]=='1'){
//                            res+=arr[j][0];
//                            if (arr[j][0]==0) break;
//                        }else {
//                            res+=arr[j][1];
//                            if (arr[j][1]==0) break;
//                        }
//                    }
//                }
//            }
//            return res;
//        }
        public long numberOfWays(String s) {
            char[] chars = s.toCharArray();
            int n=chars.length;
            int [][] arr=new int[n][2];
            int _zero=0;
            int _one=0;
            long res=0;
            for (int i=0;i<chars.length;i++) {
                if (chars[i]=='1'){
                    arr[i][0]=_zero;
                    _one++;
                }else {
                    arr[i][0]=_one;
                    _zero++;
                }
            }
            _zero=0;
            _one=0;
            for (int i=chars.length-1;i>=0;i--) {
                if (chars[i]=='1'){
                    arr[i][1]=_zero;
                    _one++;
                }else {
                    arr[i][1]=_one;
                    _zero++;
                }
            }
            for (int i=0;i<n;i++) {
                res+=arr[i][0]*arr[i][1];
            }
            return res;
        }
}
