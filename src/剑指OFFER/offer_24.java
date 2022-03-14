package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/16 - 21:04
 **/
public class offer_24 {
    public offer_06.ListNode reverseList(offer_06.ListNode head) {
        offer_06.ListNode pre=null;
        offer_06.ListNode cur=head;

        while (cur!=null){
            offer_06.ListNode tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;

        }
        return pre;
    }
}
