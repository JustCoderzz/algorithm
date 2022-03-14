package ��ָOFFER;

/**
 * @author lusir
 * @date 2021/11/14 - 15:47
 **/
public class offer_62_II {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        ���εĴ�
        //1.����Ҳ���p��q�ͷ���null,����ҵĵ��ͷ��ظõ� ps:�Ҿ���return root��Ƶĺ�����
        if(root == null || root == p || root == q) return root;
        //2.�������������p��q,��ô�ͻ᷵���ҵ��ĵ㡣����p��q���У��ͷ���pq�Ĺ����㡣����p��q��û�оͷ���null��
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        //3.�������������p||q,��ô�ͻ᷵���ҵ��ĵ㡣����p��q���У��ͷ���pq�Ĺ����㡣����p��q��û�оͷ���null��
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //4.left==null ˵������������û��p��q(���Ͽ��ʼ���ж���䣺�Ҳ����ͷ���null)
        // 5.ֱ�ӷ���right��ԭ����Ҫ��ϵݹ��˼��෽��˼����
        if(left == null) return right;
        //6.���е��˴�˵�����������ҵ���p��q�㡣
        if(right == null) return left;
        //7.���е��˴�˵��p��q���ҵ��ˣ�rootΪ����Ĺ������ȡ�(�����ֻ������һ��)
        return root;
    }
}
