import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class Priority_Queue {

    public static void main(String[] args) {

   Queue<Integer> pq = new PriorityQueue<>();
           pq.offer(20);
           pq.offer(23);
           pq.offer(22);
           pq.offer(10);
           pq.offer(40);
           pq.offer(15);
           pq.offer(23);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);









        int index = 0;
        for (Integer num : pq) {
            System.out.println("Index " + index + ": " + num);
            index++;

}
    }
}
