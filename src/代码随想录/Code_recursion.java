package 代码随想录;

/**
 * @author lusir
 * @date 2021/11/2 - 14:40
 **/
public class Code_recursion {
//    求x的N次方

    //    1.for循环  O(n)
    int fun1(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    //    2.递归    O(n)
//    递归算法的时间复杂度：递归的次数 * 每次递归中的操作次数。
    int fun2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return fun2(x, n - 1) * x;
    }

    //    3.递归加强版（减少递归层数）  O（n)
    int fun3(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 1) {
            return fun3(x, n / 2) * fun3(x, n / 2) * x;
        }
        return fun3(x, n / 2) * fun3(x, n / 2);
    }

//    4.递归plus版本    O(logn)
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
