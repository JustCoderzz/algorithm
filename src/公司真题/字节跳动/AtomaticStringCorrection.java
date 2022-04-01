package ��˾����.�ֽ�����;

import sun.reflect.generics.tree.CharSignature;

import java.util.*;

/**
 * @author lusir
 * @date 2022/4/1 - 11:26
 **/
public class AtomaticStringCorrection {
//    1.����˼�����ά��һ�����У�ÿ�μ�����ͬ���ַ��ж��� ��ֻҪ�Ǵ���2���Ǿ͸����ж����������бȽϣ����ж���ͬ�ַ�����Ϊ2�Ļ�����ֻ���һ�Σ�
//    ���ж�Ϊ1�Ļ������2�Σ��������Ǿ�ֻ���һ��
//2.������ά�ֵ�pre�����ͱ��ֵ�����һ���ַ���������������Ҫʵʱ������������������Ӵ������������pre����
//3.���������ǽ���������ַ�ȫ��ȡ��������
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
