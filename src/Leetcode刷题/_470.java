package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/3/16 - 11:05
 **/
public class _470 {
    public int rand10() {
//        P(10)=P(2)*(5)
        int first,second;
        while((first=rand7())>6);
        while((second=rand7())>5);
        return (first&1)==1?second:second+5;


    }
    public  int rand11(){
        int f,s;
        int res=12;
        while(res==12){
            while((f=rand7())>6);
            while((s=rand7())>6);
            if((f&1)==1){
                res=s;
            }else{
                res=s+6;
            }
        }
        return res;


    }
    public  int rand7(){
        return 0;
    }
}
