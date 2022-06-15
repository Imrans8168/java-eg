import java.util.LinkedList;
import java.util.Queue;

public class queprac {
    
   public static void main(String args[]){
       Queue<Integer> q = new LinkedList<>();

       q.add(4);
       q.add(2);
       q.add(1);
       q.add(7);
       System.out.println(q);
         q.remove(7);
       System.out.println(q);

   }
    
}
