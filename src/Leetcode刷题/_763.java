package LeetcodeË¢Ìâ;

import java.util.*;

/**
 * @author lusir
 * @date 2022/4/14 - 9:51
 **/
public class _763 {
    public List<Integer> partitionLabels(String s) {
//        int [][] dic=new int[26][2];
//        for (int i = 0; i < 26; i++) {
//            Arrays.fill(dic[i],-1);
//        }
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            int index=chars[i]-'a';
//            if (dic[index][0]==-1) Arrays.fill(dic[index],i);
//            else dic[index][1]=i;
//        }
//        Arrays.sort(dic, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0]!=o2[0]){
//                    return o1[0]-o2[0];
//                }else{
//                    return o1[1]-o2[1];
//                }
//            }
//        });
//        int []pre=new int[]{0,0};
//        int start=0;
//        for (int i = 0; i < dic.length; i++) {
//            if (dic[i][0]==-1) continue;
//            else {
//                pre=dic[i];
//                start=i;
//                break;
//            }
//        }
//        List<Integer> res=new ArrayList<>();
//        for (int i = start+1; i < dic.length; i++) {
//            if (dic[i][0]>pre[1]) {
//                res.add(pre[1]-pre[0]+1);
//                pre=dic[i];
//            }else if (dic[i][1]>pre[1]) {
//                pre=new int[]{pre[0],dic[i][1]};
//            }
//        }
//        res.add(pre[1]-pre[0]+1);
//        return res;
        int []last=new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i)-'a']=i;
        }
        List<Integer> res=new ArrayList<>();
        int start=0;
        int end=0;
        for (int i = 0; i < s.length(); i++) {
            end=Math.max(end,last[s.charAt(i)-'a']);
            if (i==end) {
                res.add(end-start+1);
                start=end+1;
            }
        }
        return  res;

    }
}
