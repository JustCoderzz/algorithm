package 代码随想录;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2021/12/2 - 10:33
 **/
public class Code_739 {
    public int[] dailyTemperatures(int[] temperatures) {
//        单调栈做法
        Deque<Integer> stack=new LinkedList<>();
        int [] res=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int temperature=temperatures[i];
            while(!stack.isEmpty()&&temperature>temperatures[stack.peek()]){
                int index=stack.pop();
                res[index]=i-index;
            }
            stack.push(i);
        }
        return res;
//        牛逼解法  有点动态规划的样子   该方法运行时间 与空间都比第一种好
//        class Solution {
//    public int[] dailyTemperatures(int[] temperatures) {
//        int n = temperatures.length;
//        int[] res = new int[n];
//        for (int i = n - 2; i >= 0; i--) {
//            for (int j = i + 1; j < n; j += res[j]) {
//                if (temperatures[i] < temperatures[j]) {
//                    res[i] = j - i;
//                    break;
//                } else if (res[j] == 0) {
//                    res[i] = 0;
//                    break;
//                }
//            }
//        }
//        return res;
//    }
//}
    }
}
