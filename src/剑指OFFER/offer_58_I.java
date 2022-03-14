package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/22 - 9:44
 **/
public class offer_58_I {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));

    }
    public static String reverseWords(String s) {
//        K神   3ms
        s = s.trim(); // 删除首尾空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--; // 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while(i >= 0 && s.charAt(i) == ' ') i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }
        return res.toString().trim(); // 转化为字符串并返回



//        个人做法   效率太低  18ms
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
