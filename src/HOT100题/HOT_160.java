package HOT100��;



/**
 * @author lusir
 * @date 2021/11/3 - 17:41
 **/
public class HOT_160 {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        �Լ�������
//        HOT100��.ListNode p=headA;
//        HOT100��.ListNode q=headB;
//        Set<HOT100��.ListNode> set=new HashSet<>();
//        while(p!=null){
//            set.add(p);
//            p=p.next;
//        }
//        while(q!=null){
//            if(!set.add(q)){
//                return q;
//            }
//            q=q.next;
//        }
//        return null;

//        ˫ָ�뷨  �ٷ�����
        if(headA==null||headB==null){
            return null;
        }
        ListNode pa=headA;
        ListNode pb=headB;
        while(pa!=pb){
            pa=pa==null?headB:pa.next;
            pb=pb==null?headA:pb.next;
        }
        return pa;

    }
}
