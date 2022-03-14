package ¶şË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/3/11 - 10:08
 **/
public class _415 {
    public String addStrings(String num1, String num2) {
//        int exc=0;
//
//        int i=num1.length()-1;
//        int j=num2.length()-1;
//        String str="";
//        while(i>=0&&j>=0){
//            int a=num1.charAt(i)-'0';
//            int b=num2.charAt(j)-'0';
//            int sum=a+b+exc;
//            exc=sum/10;
//            str=sum%10+str;
//            i--;
//            j--;
//        }
//        if(i>=0){
//            while(i>=0){
//                int sum=num1.charAt(i)-'0'+exc;
//                exc=sum/10;
//                str=sum%10+str;
//                i--;
//            }
//        }else{
//            while(j>=0){
//                int sum=num2.charAt(j)-'0'+exc;
//                exc=sum/10;
//                str=sum%10+str;
//                j--;
//            }
//        }
//        if(exc==1){
//            str=exc+str;
//        }
//        return  str;
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        StringBuilder stringBuilder=new StringBuilder("");
        while(i>=0||j>=0){
            int a=i>=0?num1.charAt(i)-'0':0;
            int b=j>=0?num2.charAt(j)-'0':0;
            int sum=a+b+carry;
            carry=sum/10;
            stringBuilder.append(sum%10);
            i--;
            j--;
        }
        if(carry==1) stringBuilder.append(carry);
        return stringBuilder.reverse().toString();

    }
}
