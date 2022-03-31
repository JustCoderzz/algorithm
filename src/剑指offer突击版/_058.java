package ½£Ö¸offerÍ»»÷°æ;

/**
 * @author lusir
 * @date 2022/3/31 - 13:06
 **/
public class _058 {
    class MyCalendar {
        SegmentNode root;

        public MyCalendar() {
            root=new SegmentNode(0,0);
        }

        public boolean book(int start, int end) {
            return updateSegmentTree(root,start,end);
        }

        public boolean updateSegmentTree(SegmentNode root,int start,int end) {

            SegmentNode node =root;
            while (true) {
                if (end<=node.start){
                    if (node.left==null) {
                        node.left=new SegmentNode(start,end);
                        return true;
                    }
                    node=node.left;
                }else if (node.end<=start) {
                    if (node.right==null) {
                        node.right=new SegmentNode(start,end);
                        return true;
                    }
                    node=node.right;
                }else {
                    return false;
                }
            }
        }
    }


    class SegmentNode {
        int start;
        int end;
        SegmentNode left;
        SegmentNode right;

        SegmentNode(int start,int end) {
            this.start=start;
            this.end=end;
        }
    }
}
