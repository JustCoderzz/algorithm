package ½£Ö¸offerÍ»»÷°æ;

/**
 * @author lusir
 * @date 2022/4/7 - 16:12
 **/
public class _019 {
    public boolean validPalindrome(String s) {

//        if (isBackString(s)) return true;

        int i=0;
        int j=s.length()-1;
        while (i<j) {
            if (s.charAt(i)!=s.charAt(j)){
                return isBackString(s.substring(i,j))||isBackString(s.substring(i+1,j+1));
            }
            i++;
            j--;
        }
        return true;

    }

    boolean isBackString(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return  true;
    }
}
