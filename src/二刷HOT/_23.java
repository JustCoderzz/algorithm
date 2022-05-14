package ¶þË¢HOT;

import java.util.List;

/**
 * @author lusir
 * @date 2022/5/10 - 20:36
 **/
public class _23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0) return null;
        return  mergeLists(lists,0,lists.length-1);
    }

    public ListNode mergeLists(ListNode[] lists,int L,int R){
        if (L==R) return lists[L];
        int M=(L+R)/2;
        ListNode p1=mergeLists(lists,L,M);
        ListNode p2=mergeLists(lists,M+1,R);
        return merge(p1,p2);
    }


    public ListNode merge(ListNode head1,ListNode head2) {
        ListNode dummy=new ListNode(-1);
        ListNode p1=head1;
        ListNode p2=head2;
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
