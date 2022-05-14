package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/9 - 19:22
 **/
public class _2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        int exc=0;
        while (p1!=null||p2!=null) {
            int a_Num=p1==null?0:p1.val;
            int b_Num=p2==null?0:p2.val;
            cur.next=new ListNode((a_Num+b_Num+exc)%10);
            exc=(a_Num+b_Num+exc)/10;
            if (p1!=null) p1=p1.next;
            if (p2!=null) p2=p2.next;
            cur=cur.next;
        }
        if (exc==1) cur.next=new ListNode(exc);
        return dummy.next;
    }
}
