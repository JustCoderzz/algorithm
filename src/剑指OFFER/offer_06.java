package ½£Ö¸OFFER;

import java.util.Stack;

/**
 * @author lusir
 * @date 2021/11/9 - 19:40
 **/
public class offer_06  {
    public int[] reversePrint(ListNode head) {
        Stack<Integer>  stack=new Stack<>();
        int count=0;
        while (head!=null){
            stack.push(head.val);
            head=head.next;
            count++;
        }
        int []res=new int[count];
        for(int i=0;i<count;i++){
            res[i]=stack.pop();
        }
        return  res;

    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


