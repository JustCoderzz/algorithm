package ��ָOFFER;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lusir
 * @date 2021/11/21 - 9:45
 **/
public class offer_52 {
    public offer_06.ListNode getIntersectionNode(offer_06.ListNode headA, offer_06.ListNode headB) {
//        Set<offer_06.ListNode> set=new HashSet<>();
//        while(headA!=null){
//            set.add(headA);
//            headA=headA.next;
//        }
//        while(headB!=null){
//            if(set.contains(headB)){
//                return headB;
//            }
//            headB=headB.next;
//        }
//        return null;

//        ����˼·���� A�б��㹲��a�����   B�б���b�����  �ཻ��㹲��C��
//        �ཻ���ǰ    A��a-c    B��  b-c
//        ����   a-c+b=b-c+a  ��˱���Ը��ݵ�ʽ�ҵ���һ���ཻ�Ľ�㡣
        offer_06.ListNode A=headA;
        offer_06.ListNode B=headB;
        while(A!=B){
            A=A!=null?A.next:headB;
            B=B!=null?B.next:headA;
        }
        return A;
    }
}
