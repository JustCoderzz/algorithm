package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/21 - 8:51
 **/
public class offer_58_II {
    public String reverseLeftWords(String s, int n) {
//        1.
//        StringBuilder sb=new StringBuilder();
//        for(int i=n;i<s.length();i++){
//            sb.append(s.charAt(i));
//        }
//        for(int i=0;i<n;i++){
//            sb.append(s.charAt(i));
//        }
//        return sb.toString();

//      2.
//        StringBuilder sb=new StringBuilder(s);
//        for(int i=0;i<n;i++){
//            sb.append(sb.charAt(0));
//            sb.deleteCharAt(0);
//        }
//        return sb.toString();

//        3.
        return s.substring(n, s.length()) + s.substring(0, n);

//        4.
//        StringBuilder res = new StringBuilder();
//        for(int i = n; i < n + s.length(); i++)
//            res.append(s.charAt(i % s.length()));
//        return res.toString();


    }
}
