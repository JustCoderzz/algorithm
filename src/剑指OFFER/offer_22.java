package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/22 - 12:33
 **/
public class offer_22 {
    public offer_06.ListNode getKthFromEnd(offer_06.ListNode head, int k) {
        offer_06.ListNode slow=head;
        offer_06.ListNode fast=head;
        while(k--!=0){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
