package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/10 - 20:19
 **/
public class _21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode p1=list1;
        ListNode p2=list2;
        ListNode cur=dummy;
        while (p1!=null&&p2!=null){
            if (p1.val<p2.val){
                cur.next=p1;
                p1=p1.next;
            }else{
                cur.next=p2;
                p2=p2.next;
            }
            cur=cur.next;
        }
        cur.next=p1!=null?p1:p2;
        return dummy.next;
    }
}
