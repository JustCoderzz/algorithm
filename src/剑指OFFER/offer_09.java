package ½£Ö¸OFFER;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2021/10/30 - 10:42
 **/
public class offer_09 {
    class CQueue {
        Deque<Integer> stack1;
        Deque<Integer> stack2;
        public CQueue() {
            stack1=new LinkedList<>();
            stack2=new LinkedList<>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {

            if(stack2.isEmpty()){
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            if(stack2.isEmpty()){
                return -1;
            }else{
                int num=stack2.pop();
                return num;
            }
        }
    }
}
