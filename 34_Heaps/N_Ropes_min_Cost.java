import java.util.*;
public class N_Ropes_min_Cost {
    public static void main(String args[]){
        int ropes[] = {};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        while(pq.size()>1){
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost += min1 +min2;
            pq.add(min1 + min2);
        }
        System.out.print("Minimum Cost = "+cost);
    }
}
