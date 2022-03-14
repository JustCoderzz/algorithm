package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/10/30 - 15:21
 **/
public class offer_58 {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        String str="";
        for(int i=strs.length-1;i>=0;i--){
            if(i!=0){
                str+=strs[i]+" ";
            }else {
                str+=strs[i];
            }

        }
        return  str;

    }
}
