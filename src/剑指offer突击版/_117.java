package ½£Ö¸offerÍ»»÷°æ;

/**
 * @author lusir
 * @date 2022/4/20 - 21:17
 **/
public class _117 {
    public int numSimilarGroups(String[] strs) {
        int n=strs.length;
        int[] parent=new int[n];
        for (int i = 0; i <n ; i++) {
            parent[i]=i;
        }
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j < n; j++) {
                int p1=getParent(parent,i);
                int p2=getParent(parent,j);
                if (p1==p2) continue;
                if (isSimilarStr(strs[i],strs[j])){
                    parent[p1]=p2;
                }
            }
        }
        int res=0;
        for (int i = 0; i < n; i++) {
            if (parent[i]==i){
                res++;
            }
        }
        return res;
    }
    int getParent(int[]parent,int i) {
        int p=i;
        while (p!=parent[p]){
            p=parent[p];
        }
        return p;
    }

    public  boolean isSimilarStr(String s1,String s2) {
        int count=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)!=s2.charAt(i)){
                count++;
                if (count>2) return false;
            }
        }
        return true;
    }
}
