package LeetcodeË¢Ìâ;

import java.beans.beancontext.BeanContext;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/14 - 23:31
 **/
public class _93 {

    List<String> res=new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        if(s.length()>12) return res;
        backTrace(s,0,0);
        return res;
    }

    public  void backTrace(String s,int index,int point){
        if(point==3){
            if(isValid(s,index,s.length()-1)){
                res.add(s);
            }
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isValid(s,index,i)){
                s=s.substring(0,i+1)+"."+s.substring(i+1);
                point++;
                backTrace(s,i+2,point);
                point--;
                s=s.substring(0,i+1)+s.substring(i+2);
            }else{
                break;
            }
        }


    }

    public  boolean  isValid(String s,int start,int end){
        if(end<start) return false;
        if(s.charAt(start)=='0'&&start!=end) return false;
        int num=0;
        for(int i=start;i<=end;i++){
            if(s.charAt(i)>'9'||s.charAt(i)<'0') return false;
            num=num*10+s.charAt(s.charAt(i)-'0');
            if(num>225) return  false;
        }
        return true;


    }

}
