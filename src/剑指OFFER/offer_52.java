package 剑指OFFER;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lusir
 * @date 2021/11/21 - 9:45
 **/
public class offer_52 {
    public offer_06.ListNode getIntersectionNode(offer_06.ListNode headA, offer_06.ListNode headB) {
//        Set<offer_06.ListNode> set=new HashSet<>();
//        while(headA!=null){
//            set.add(headA);
//            headA=headA.next;
//        }
//        while(headB!=null){
//            if(set.contains(headB)){
//                return headB;
//            }
//            headB=headB.next;
//        }
//        return null;

//        解题思路就是 A列表结点共有a个结点   B列表共有b个结点  相交结点共有C个
//        相交结点前    A有a-c    B有  b-c
//        则有   a-c+b=b-c+a  因此便可以根据等式找到第一个相交的结点。
        offer_06.ListNode A=headA;
        offer_06.ListNode B=headB;
        while(A!=B){
            A=A!=null?A.next:headB;
            B=B!=null?B.next:headA;
        }
        return A;
    }
}
