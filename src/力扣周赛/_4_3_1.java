package Á¦¿ÛÖÜÈü;

import javax.annotation.Resource;

/**
 * @author lusir
 * @date 2022/4/3 - 10:30
 **/
public class _4_3_1 {
    int res=0;
    public int convertTime(String current, String correct) {
        String[] s1 = current.split(":");
        String[] s2 = correct.split(":");
        int h1=Integer.parseInt(s1[0]);
        int h2=Integer.parseInt(s2[0]);
        int m1=Integer.parseInt(s1[1]);
        int m2=Integer.parseInt(s2[1]);
        int a=h1*60+m1;
        int b=h2*60+m2;
        if (a==b) return 0;
        int l=0;
        if (a<b) {
             l=b-a;
        }else {
            l=24*60-(b-a);
        }
        caulate(l);
        return res;
    }
    public void caulate(int l){
        if (l/60!=0) {
            res+=l/60;
            l=l%60;
        }
        if (l/15!=0) {
            res+=l/15;
            l=l%15;
        }
        if (l/5!=0){
            res+=l/5;
            l=l%5;
        }
        res+=l;
    }
}
