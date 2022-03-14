package HOT100Ã‚;

import java.util.Timer;

/**
 * @author lusir
 * @date 2021/11/29 - 15:55
 **/
public class HOT_208 {


    class Trie {
        boolean isEnd;
        Trie [] children;

        public Trie() {
            isEnd=false;
            children=new Trie[26];
        }

        public void insert(String word) {
            if(word==null) return;
            Trie node=this;
            for(int i=0;i<word.length();i++){
                int index=word.charAt(i)-'a';
                if(node.children[index]==null){
                    node.children[index]=new Trie();
                }
                node=node.children[index];
            }
            node.isEnd=true;
        }

        public boolean search(String word) {
            Trie node=searchPrefix(word);
            return node!=null&&node.isEnd;
        }

        public boolean startsWith(String prefix) {
            return  searchPrefix(prefix)!=null;
        }

        private  Trie searchPrefix(String prefix){
            Trie node=this;
            for(int i=0;i<prefix.length();i++){
                int index=prefix.charAt(i)-'a';
                if(node.children[index]==null){
                    return null;
                }
                node=node.children[index];
            }
            return node;

        }


    }

}
