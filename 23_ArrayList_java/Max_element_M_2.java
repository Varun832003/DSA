import java.util.*;

public class Max_element_M_2 {
    public static void main(String args[]){ // T.C = O(n)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size();  i++){
              max = Math.max(max,list.get(i));
        }
        System.out.println(max);
    }
}
