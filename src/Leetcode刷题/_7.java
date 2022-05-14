package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/5/2 - 0:33
 **/
public class _7 {
    public int reverse(int x) {
        String str=x+"";
        int n=str.length();
        int res=0;
        int sign=Character.isDigit(str.charAt(0))?1:-1;
        for (int i=n-1;i>=0;i--) {
            if (!Character.isDigit(str.charAt(i))) continue;
            if (res*sign>Integer.MAX_VALUE/10||res*sign<Integer.MIN_VALUE/10) return 0;
            if (res*sign==Integer.MAX_VALUE/10
                    &&Integer.MAX_VALUE%(Integer.MAX_VALUE/10)<str.charAt(i)-'0') return 0;
            if (res*sign==Integer.MIN_VALUE/10
                    &&(Integer.MIN_VALUE%(Integer.MIN_VALUE/10))*sign<str.charAt(i)-'0') return 0;
            res=res*10+str.charAt(i)-'0';
        }
        return res*sign;
    }
}
