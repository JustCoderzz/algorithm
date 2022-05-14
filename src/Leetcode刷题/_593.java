package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/4/29 - 23:42
 **/
public class _593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int aLength=compute(p1,p2);
        int bLength=compute(p3,p4);
        int cLength=compute(p2,p3);
        int fLength=compute(p1,p4);
        int dLength=compute(p1,p3);
        if (aLength==bLength&&fLength==cLength&&bLength==cLength){
            if (aLength+cLength==dLength) return true;
        }
        return false;
    }
    public int compute(int[] p1,int[] p2) {
        int aLength=p2[1]-p1[1];
        int bLength=p2[0]-p1[0];
        return aLength*aLength+bLength*bLength;
    }
}
