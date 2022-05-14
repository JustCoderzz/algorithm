package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/5/2 - 21:55
 **/
public class _165 {
    public  int compareVersion(String version1, String version2) {
        String[] chars_v1 = version1.split("\\.");
        String[] chars_v2 = version2.split("\\.");
        int m=chars_v1.length;
        int n=chars_v2.length;
        int i=0;
        while (i<m||i<n){
            int x=i<m?Integer.parseInt(chars_v1[i]):0;
            int y=i<n?Integer.parseInt(chars_v2[i]):0;
            if (x>y) return 1;
            else if (x<y) return -1;
        }
        return 0;
    }

}
