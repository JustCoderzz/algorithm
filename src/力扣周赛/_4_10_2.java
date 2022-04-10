package ¡¶ø€÷‹»¸;

/**
 * @author lusir
 * @date 2022/4/10 - 11:36
 **/
public class _4_10_2 {
    public String minimizeResult(String expression) {
        String[] strList = expression.split("\\+");
        String a=strList[0];
        String b=strList[1];
        int min=Integer.parseInt(a)+Integer.parseInt(b);
        String res="("+expression+")";
        for (int i=0;i<=a.length()-1;i++) {
            String pre="";
            String lCur="";
            if (i>0) pre=a.substring(0,i);
            lCur=a.substring(i);
            for (int j=1;j<=b.length();j++) {
                String end="";
                String rCur="";
                rCur=b.substring(0,j);
                if (j<b.length()) end=b.substring(j);
                int num=1;
                num*=Integer.parseInt(lCur)+Integer.parseInt(rCur);
                if (pre!="") num*=Integer.parseInt(pre);
                if (end!="") num*=Integer.parseInt(end);
                if (num<min) {
                    min=num;
                    res=pre+"("+lCur+"+"+rCur+")"+end;
                }
            }
        }
        return res;
    }
}
