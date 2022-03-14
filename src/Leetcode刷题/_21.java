package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/2/25 - 22:59
 **/
public class _21 {
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
        while(list1!=null&&list2!=null){
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
