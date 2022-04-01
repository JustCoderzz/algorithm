package 公司真题.字节跳动;

import sun.reflect.generics.tree.CharSignature;

import java.util.*;

/**
 * @author lusir
 * @date 2022/4/1 - 11:26
 **/
public class AtomaticStringCorrection {
//    1.核心思想就是维护一个队列，每次计算相同的字符有多少 ，只要是大于2我们就跟队列顶的数量进行比较，队列顶相同字符数量为2的话我们只添加一次，
//    队列顶为1的话就添加2次，否则我们就只添加一次
//2.我们所维持的pre变量就保持的是上一个字符的数量，我们需要实时根据我们往队列里添加次数来更新这个pre变量
//3.最后就是我们将队列里的字符全部取出来就行
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        String [] list=new String[n];
        for (int i=0;i<n;i++) {
            list[i]=reader.next();
        }
        for (int i=0;i<n;i++) {
            String res=solution(list[i]);
            System.out.println(res);
        }
    }

    static String solution(String str) {
        char[] chars = str.toCharArray();
        int n=chars.length;
        Deque<Character> deque=new LinkedList<>();
        int j=0;
        int pre=1;
        while (j<n) {
            int cnt=1;
            while (j+1<n&&chars[j+1]==chars[j]){
                cnt++;
                j++;
            }
            int sum=0;
            if (cnt>=2&&pre==1) {
                deque.offerLast(chars[j]);
                sum++;
            }
            deque.offerLast(chars[j]);
            sum++;
            pre=sum;
            j++;
        }
        StringBuilder sb=new StringBuilder();
        int size=deque.size();
        for (int i=0;i<size;i++){
            sb.append(deque.pollFirst());
        }
        return sb.toString();
    }
}
