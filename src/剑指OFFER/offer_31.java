package ��ָOFFER;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*z
 * @author lusir
 * @date 2021/11/24 - 19:15
 **/
public class offer_31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
//        K��ͨ�� ģ��Ľⷨ ��һ��ջ��ģ�����
        Stack<Integer> stack=new Stack<>();
        int i=0;
        for(int num:pushed){
            stack.push(num);
            while(!stack.isEmpty()&&stack.peek()==popped[i]){
                i++;
                stack.pop();
            }
        }
        return stack.isEmpty();


//        ���˵Ľⷢ
//        Map<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<pushed.length;i++){
//            map.put(pushed[i],i);
//        }
//        for(int i=0;i<popped.length;i++){
//            int base=map.get(popped[i]);
//            int key=Integer.MAX_VALUE;
//
//            for(int j=i+1;j<popped.length;j++){
//
//                int num=map.get(popped[j]);
//                if(num>base){
//                    continue;
//                }
//
//                if(num>key){
//                    return false;
//                }else{
//                    key=num;
//                }
//            }
//        }
//        return true;
    }
}
