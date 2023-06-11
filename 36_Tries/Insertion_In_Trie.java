package Tries;

public class Insertion_In_Trie {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        Node(){
            for(int i=0; i<children.length; i++){
                children[i]=null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){ // O(l)--> length of the largest word.
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow=true;
    }
    public static void main(String args[]){
        String words[] = {"the","a","there","their","any","thee"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
    }
}
