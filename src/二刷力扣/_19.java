package ¶þË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/3/3 - 20:47
 **/
public class _19 {
    public  class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public  ListNode removeNthFromEns(ListNode head,int n){
        ListNode pre=new ListNode(0,head);
        ListNode ans=pre;
        ListNode slow=head;
        ListNode fast=head;
        for(int i=n-1;i>0;i--){
            fast=fast.next;
        }
        while(fast.next!=null){
            pre=pre.next;
            slow=slow.next;
            fast=fast.next;
        }
        pre.next=slow.next;
        return ans.next;
    }
}
