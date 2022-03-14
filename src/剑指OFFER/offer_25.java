package 剑指OFFER;

import java.util.zip.CRC32;

/**
 * @author lusir
 * @date 2021/11/21 - 9:26
 **/
public class offer_25 {
    public offer_06.ListNode mergeTwoLists(offer_06.ListNode l1, offer_06.ListNode l2) {
        offer_06.ListNode z=new offer_06.ListNode(0);
        offer_06.ListNode cur=z;
            while(l1!=null&&l2!=null){

                if(l1.val<=l2.val){

                   cur.next=l1;
                   l1=l1.next;
                }else{
                    cur.next=l2;
                    l2=l2.next;
                }
                cur=cur.next;

            }
            cur.next=l1==null?l2:l1;
            return z.next;
//            递归方法   更好理解
//            if(l1==null) return l2;
//        if(l2==null) return l1;
//        if(l1.val<=l2.val){
//            l1.next=mergeTwoLists(l1.next,l2);
//            return l1;
//        }else{
//            l2.next=mergeTwoLists(l1,l2.next);
//            return l2;
//        }
    }
}
