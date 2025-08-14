import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    public static void main(String[] args) {
        //List<Integer> num= new LinkedList<>();

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(11);
        queue.offer(12);
        queue.offer(13);
        System.out.println(queue);
        queue.poll();

        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
