package HOT100Ìâ;



/**
 * @author lusir
 * @date 2021/10/29 - 15:08
 **/
public class HOT_19 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
//        Ë«Ö¸Õë·¨
        ListNode p=new ListNode(0,head);
        ListNode first=head;
        ListNode second=p;
        for(int i=0;i<n;i++){
            first=first.next;
        }
        while (first!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        ListNode ans=p.next;
        return ans;
    }
}
