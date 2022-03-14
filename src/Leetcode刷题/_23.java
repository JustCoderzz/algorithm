package LeetcodeÀ¢Ã‚;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/10 - 10:03
 **/
public class _23 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0) return null;
        return allMerge(lists,0,lists.length-1);

    }
    public  ListNode merge(ListNode l1,ListNode l2){
          if(l1==null) return l2;
          if(l2==null) return l1;
          if(l1.val<l2.val){
              l1.next=merge(l1.next,l2);
              return l1;
          }else{
              l2.next=merge(l1,l2.next);
              return l2;
          }
    }

    public ListNode allMerge(ListNode[]lists,int left,int right){
          if(left==right) return  lists[left];
          if(left>right) return  null;
          int mid=(left+right)/2;
          ListNode l= allMerge(lists,left,mid);
          ListNode r=allMerge(lists,mid+1,right);
          return merge(l,r);
    }
}
