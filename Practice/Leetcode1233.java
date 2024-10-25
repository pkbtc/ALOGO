import java.util.*;
public class Leetcode1233 {
    class TrieNode{
        TrieNode[] children;
        boolean isLast;
        public TrieNode(){
            children=new TrieNode[27];
            isLast=false;
        }

    }
    static TrieNode root;
    public static void main(String[] args) {
            String[] folder={"/a","/a/b","/c/d","/c/d/e","/c/f"};
            List<String> list=new Leetcode1233().removeSubfolders(folder);
            System.out.println(list);
    }
    public List<String> removeSubfolders(String[] folder) {
            root =new TrieNode();
            Arrays.sort(folder,(s1,s2)->s1.length()-s2.length());
            List<String> list=new ArrayList<>();
            for(String s:folder){
                if(!search(s)){
                    insert(s);
                    list.add(s);
                }
            }
            return list;
    }
    private int getIndex(char c){
        return c=='/'? 26:c-'a';
    }
    private void insert(String s){
        TrieNode node=root;
        for(char c:s.toCharArray()){
            int index=getIndex(c);
            if(node.children[index]==null){
                node.children[index]=new TrieNode();
            }
            node=node.children[index];
        }
        node.children[26]=new TrieNode();
        node=node.children[26];
        node.isLast=true;

    }
    private boolean search(String s){
        TrieNode node=root;

        for(char c:s.toCharArray()){
            if(node.isLast){
                return true;
            }
            int index=getIndex(c);
            if(node.children[index]==null){
                return false;
            }
            node=node.children[index];
        }
        return node.isLast;
    }

}
