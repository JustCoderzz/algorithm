package HOT100Ìâ;

/**
 * @author lusir
 * @date 2021/11/4 - 10:05
 **/
public class HOT_2 {
    public class ListNode{
        int val;
        HOT_19.ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val, HOT_19.ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p=l1;
        ListNode q=l2;
        ListNode res=null;
        ListNode tmp=null;
        int count=0;
        while(p!=null||q!=null){
            int value1=p==null?0:p.val;
            int value2=q==null?0:q.val;
            int sum=value1+value2+count;

            if(res==null){
                res=tmp=new ListNode(sum%10);
            }else{
                tmp.next=new ListNode(sum%10);
                tmp=tmp.next;
            }

            count=sum/10;
            if(p!=null){
                p=p.next;
            }
            if(q!=null){
                q=q.next;
            }
        }
        if(count>0){
            tmp.next=new ListNode(count);
        }
        return res;

    }
}
