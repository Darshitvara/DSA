import java.util.PriorityQueue;
public class Heap{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a); 
        pq.add(3);
        pq.add(1);
        pq.add(2);
        // while (!pq.isEmpty()) {
        //     System.out.println(pq.poll());
        // }

        for(int n : pq){
            System.out.println(n);
        }
        // System.out.println(pq.peek());
    }
}