package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/3/16 - 21:31
 **/
public class _4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m=nums1.length;
        int n=nums2.length;
        int len=m+n;
        int left=-1;
        int right=-1;
        int a=0;
        int b=0;
        for (int i=0;i<=len/2;i++) {
            left=right;
            if (a<m&&(b>=n||nums1[a]<nums2[b])) {
                right=nums1[a++];
            }else {
                right=nums2[b++];
            }
        }
        if ((len&1)==0) {
            return  (left+right)/2.0;
        }
        return right;
    }
}
