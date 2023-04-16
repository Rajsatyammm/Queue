
// package Queue;
import java.util.*;

// input (Queue) :  1, 2, 3, 4, 5, 6, 7, 8, 9, 10
// Output  : 1, 6, 2, 7, 3, 8, 4, 9, 5, 10

public class Interleave {

    public static void interleave(Queue<Integer> q1) {
        Queue<Integer> q2 = new LinkedList<>();
        // System.out.println(q1.size() / 2);
        for (int i = 0; i <= (q1.size() / 2) + 1; i++) {
            q2.add(q1.remove());
        }

        while (!q1.isEmpty() && !q2.isEmpty()) {
            q1.add(q2.remove()); 
            q1.add(q1.remove()); 
            
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new PriorityQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

     
        interleave(q);
        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
