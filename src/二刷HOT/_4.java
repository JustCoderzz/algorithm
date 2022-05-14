package ¶şË¢HOT;

/**
 * @author lusir
 * @date 2022/5/9 - 19:46
 **/
public class _4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;int n=nums2.length;
        int M=(m+n)/2;int count=0;
        double left=0;double right=0;
        int i=0;int j=0;
        while (count++<=M) {
            left=right;
            right=i<m&&(j>=n||nums1[i]<nums2[j])?nums1[i++]:nums2[j++];
        }
        return (m+n)%2==0?(left+right)/2:right;
    }
}
