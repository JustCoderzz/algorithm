package Á¦¿ÛÖÜÈü;

/**
 * @author lusir
 * @date 2022/4/2 - 22:30
 **/
public class _4_2_1 {
    public int minBitFlips(int start, int goal) {
        int count=0;
        while (goal!=0) {
            int a=goal&1;
            int b=start&1;
            if (a!=b) count++;
            goal=goal>>1;
            start=start>>1;
        }
        while (start!=0) {
            int num=start&1;
            if (num==1) count++;
            start=start>>1;
        }
        return count;
    }
}
