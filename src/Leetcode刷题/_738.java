package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/25 - 10:57
 **/
public class _738 {
    public int monotoneIncreasingDigits(int n) {

        char []chars=(n+"").toCharArray();
        int max=-1;
        int index=-1;

        for(int i=0;i<chars.length-1;i++){

            if (max<chars[i]) {
                max=chars[i];
                index=i;
            }
            if (chars[i]>chars[i+1]) {
                chars[index]--;
                for(int j=index+1;j<chars.length;j++){
                    chars[j]='9';
                }
                break;
            }
        }
        return Integer.parseInt(new String(chars));




    }


}
