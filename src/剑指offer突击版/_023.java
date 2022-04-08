package ½£Ö¸offerÍ»»÷°æ;

/**
 * @author lusir
 * @date 2022/4/8 - 23:18
 **/
public class _023 {
     class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

         ListNode p=headA;
         ListNode q=headB;
         while (p!=q) {
             p=p.next==null?headB:p.next;
             q=q.next==null?headA:q.next;
         }
         return p;
    }
}
