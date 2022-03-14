package HOT100��;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lusir
 * @date 2021/11/27 - 9:57
 **/
public class HOT_3 {
    public int lengthOfLongestSubstring(String s) {
//        int n=s.length();
//        if(n==0) return 0;
//        Set<Character> set=new HashSet<>();
//        set.add(s.charAt(0));
//        int i=0,j=1;
//        while (j<=n-1){
//            if(set.contains(s.charAt(j))){
//
//                set.remove(s.charAt(i));
//                if (!set.add(s.charAt(j))){
//
//                }
//                i++;
//                j++;
//
//            }else{
//                set.add(s.charAt(j));
//                j++;
//            }
//
//        }
//        return j-i+1;
        // ��ϣ���ϣ���¼ÿ���ַ��Ƿ���ֹ�
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // ��ָ�룬��ʼֵΪ -1���൱���������ַ�������߽����࣬��û�п�ʼ�ƶ�
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // ��ָ�������ƶ�һ���Ƴ�һ���ַ�
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // ���ϵ��ƶ���ָ��
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // �� i �� rk ���ַ���һ�����������ظ��ַ��Ӵ�
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;

    }
}
