package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/3/23 - 13:52
 **/
public class _860 {
    public boolean lemonadeChange(int[] bills) {

        int _five=0;
        int _ten=0;


        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                _five++;
            }
            if(bills[i]==10){
                if(_five!=0){
                    _five--;
                    _ten++;
                }else return false;
            }
            if(bills[i]==20){
                if(_five==0) return  false;
                else if (_ten!=0){
                    _ten--;
                    _five--;
                }else if (_five>=3){
                    _five-=3;
                }else return  false;
            }
        }
        return true;
    }
}
