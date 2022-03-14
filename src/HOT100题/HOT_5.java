package HOT100Ã‚;

/**
 * @author lusir
 * @date 2021/11/27 - 13:18
 **/
public class HOT_5 {
    public String longestPalindrome(String s) {
        String res=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            for(int j=i;j<i+2;j++){
                int left=i;
                int right=j;
                while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                    if(right-left+1>=res.length()) res=s.substring(left,right+1);
                    left--;
                    right++;

                }
            }
        }
        return res;
    }

}
