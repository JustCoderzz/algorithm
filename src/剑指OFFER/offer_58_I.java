package ��ָOFFER;

/**
 * @author lusir
 * @date 2021/11/22 - 9:44
 **/
public class offer_58_I {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));

    }
    public static String reverseWords(String s) {
//        K��   3ms
        s = s.trim(); // ɾ����β�ո�
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--; // �����׸��ո�
            res.append(s.substring(i + 1, j + 1) + " "); // ��ӵ���
            while(i >= 0 && s.charAt(i) == ' ') i--; // �������ʼ�ո�
            j = i; // j ָ���¸����ʵ�β�ַ�
        }
        return res.toString().trim(); // ת��Ϊ�ַ���������



//        ��������   Ч��̫��  18ms
//       String str=s.trim();
//       int j=str.length()-1;
//       if(s.length()==1) return s;
//       String res="";
//       int i=j-1;
//       while (i>=0){
//           if(!Character.isSpaceChar(str.charAt(i))&&Character.isSpaceChar(str.charAt(i+1))){
//               j=i;
//           }
//           if(i==0){
//               res+=str.substring(i,j+1);
//           }
//           if(Character.isSpaceChar(str.charAt(i))&&!Character.isSpaceChar(str.charAt(i+1))){
//               res+=str.substring(i+1,j+1)+" ";
//           }
//
//           --i;
//       }
//       return res;
    }
}
