package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/7 - 10:16
 **/
public class offer_05 {
    public static void main(String[] args) {
        offer_05 res=new offer_05();
        String s = res.replaceSpace(new String("We are happy."));
        System.out.println(s);
    }
    public String replaceSpace(String s) {
        char blank=' ';
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==blank){
                stringBuilder.append("%20");
            }else{
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
