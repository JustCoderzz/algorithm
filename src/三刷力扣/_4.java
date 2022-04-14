package ÈıË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/4/14 - 13:55
 **/
public class _4 {

    public double findMedianSortedArrays(int[] nums1,int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int len=m+n;

        int a=0;
        int b=0;
        int left=-1;
        int right=-1;
        for (int i = 0; i <= len / 2; i++) {
            left=right;
            if (b>=n||(a<m&&nums1[a]<nums2[b])) {
                right=nums1[a];
                a++;
            }else{
                right=nums2[b];
                b++;
            }
        }
        if (len%2==0) {
            return (left+right)/2.0;
        }else{
            return right;
        }
    }
}
