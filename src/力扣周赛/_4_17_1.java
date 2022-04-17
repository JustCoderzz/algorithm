package Á¦¿ÛÖÜÈü;

/**
 * @author lusir
 * @date 2022/4/17 - 10:29
 **/
public class _4_17_1 {
    public String digitSum(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        while (n>k) {
            if (n%k==0){
                n=n/k;
            }else n=n/k+1;
            StringBuilder tmp=new StringBuilder();
            for (int i = 0; i < n; i++) {
                int num=0;
                for (int j = i*k; j < (i+1)*k&&j<sb.length(); j++) {
                    num+=sb.charAt(j)-'0';
                }
                tmp.append(num);
            }
            sb=tmp;
            n=sb.length();
        }
        return sb.toString();
    }
}
