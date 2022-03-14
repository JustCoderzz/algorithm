package ��������¼;

/**
 * @author lusir
 * @date 2021/11/2 - 14:40
 **/
public class Code_recursion {
//    ��x��N�η�

    //    1.forѭ��  O(n)
    int fun1(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    //    2.�ݹ�    O(n)
//    �ݹ��㷨��ʱ�临�Ӷȣ��ݹ�Ĵ��� * ÿ�εݹ��еĲ���������
    int fun2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return fun2(x, n - 1) * x;
    }

    //    3.�ݹ��ǿ�棨���ٵݹ������  O��n)
    int fun3(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 1) {
            return fun3(x, n / 2) * fun3(x, n / 2) * x;
        }
        return fun3(x, n / 2) * fun3(x, n / 2);
    }

//    4.�ݹ�plus�汾    O(logn)
    int fun4(int x,int n){
        if(n==0){
            return 1;
        }
        int t=fun4(x,n/2);
        if (n%2==1){
            return t*t*x;
        }
        return t*t;
    }
}
