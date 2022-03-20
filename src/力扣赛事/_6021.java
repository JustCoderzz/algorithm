package 力扣赛事;

/**
 * @author lusir
 * @date 2022/3/20 - 16:15
 **/
public class _6021 {
    public long maximumSubsequenceCount(String text, String pattern) {

        //统计 a  c
        long cCount=0;
        int c=0;
        int a=0;
        if(pattern.charAt(0)!=pattern.charAt(1)){
            for(int i=text.length()-1;i>=0;i--){
                if(text.charAt(i)==pattern.charAt(1)) c++;
                if(text.charAt(i)==pattern.charAt(0)) {
                    cCount+=c;
                    a++;
                }
            }
            if(a>c){
                cCount+=a;
            }else{
                cCount+=c;
            }
            return cCount;
        }else{
            for(int i=text.length()-1;i>=0;i--){
                if(text.charAt(i)==pattern.charAt(0)) c++;
            }
            c++;
            while(c!=0){
                cCount+=c-1;
                c--;
            }
            return cCount;
        }





    }
}
