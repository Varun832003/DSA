package Hashing.HashMap;
import java.util.*;
public class Valid_Anagrams {
    public static boolean isAnagrams(String s, String t){ // T.C = O(n)
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String args[]){
        String s = "race";
        String t = "care";
        System.out.println(isAnagrams(s,t));
    }
}
