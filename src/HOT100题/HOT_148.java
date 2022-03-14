package HOT100Ã‚;

import LeetcodeÀ¢Ã‚._21;

/**
 * @author lusir
 * @date 2021/12/1 - 16:21
 **/
public class HOT_148 {
    public ListNode sortList(ListNode head) {

        return sort(head,null);


    }
    public  ListNode sort(ListNode head,ListNode tail){
        if(head==null) return head;
        if(head.next==tail){
            head.next=null;
            return head;
        }
        ListNode slow=head,fast=head;
        while(fast!=tail){
            fast=fast.next;
            slow=slow.next;
            if(fast!=tail){
                fast=fast.next;
            }
        }
        ListNode mid=slow;
        ListNode s1=sort(head,mid);
        ListNode s2=sort(mid,tail);
        ListNode res=mergeTwoLists(s1,s2);
        return res;
    }


      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(0);
        ListNode cur=head;
        ListNode p=list1,q=list2;
        while(p!=null&&list2!=null){
            if(list1.val<list2.val){
                cur.next=list1;
                cur=cur.next;
                list1=list1.next;
            }else{
                cur.next=list2;
                cur=cur.next;
                list2=list2.next;
            }



        }
        if(list1!=null){
            cur.next=list1;
        }
        if(list2!=null){
            cur.next=list2;
        }
        return head.next;
    }
}
