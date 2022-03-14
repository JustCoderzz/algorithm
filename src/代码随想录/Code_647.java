package ��������¼;

/**
 * @author lusir
 * @date 2021/12/12 - 12:11
 **/
public class Code_647 {
//   �����ⷨ
    // public int countSubstrings(String s) {
    //     int num=0;
    //     int size=s.length();
    //     for(int i=0;i<size;i++){
    //         for(int j=0;j<=1;j++){
    //             int l=i;
    //             int r=i+j;
    //             while(l>=0&&r<size&&s.charAt(l--)==s.charAt(r++)) num++;
    //         }
    //     }
    //     return num;
    // }

//    �м�㷽��
//    public int countSubstrings(String s) {
//        int sum=0;
//        for(int i=0;i<s.length()-1;i++){
//            for(int j=i;j<i+2;j++){
//                int l=i;
//                int r=j;
//                while(l>=0&&j<s.length()&&s.charAt(l--)==s.charAt(r++)) sum++;
//            }
//        }
//        return sum;
//    }

    //    ��̬�滮
//    dp[i][j]��������±�i���±�j�Ƿ�Ϊ�����ַ���
    public int countSubstrings(String s) {

        int res = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 1) {
                        res++;
                        dp[i][j] = true;
                    } else if (dp[i + 1][j - 1]) {
                        res++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        return res;


    }

}
