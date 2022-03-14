package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/22 - 12:40
 **/
public class offer_18 {
    public offer_06.ListNode deleteNode(offer_06.ListNode head, int val) {
        offer_06.ListNode pre=new offer_06.ListNode(0);
        offer_06.ListNode cur=head;

        pre.next=cur;
        head=pre;
        while(cur!=null){
            offer_06.ListNode tmp=cur.next;
            if(cur.val==val){
                pre.next=tmp;

            }else{
                pre=cur;

            }
            cur=tmp;

        }
        return head.next;

    }
}
