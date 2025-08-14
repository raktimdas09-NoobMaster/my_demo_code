import java.util.ArrayDeque;

public class Array_Deque {

    public static void main(String[] args) {

ArrayDeque<Integer> num= new ArrayDeque<>();

     num.offer(23);
     num.offer(34);
        num.offerLast(37);
     num.offer(21);
     num.offerFirst(29);

     num.offer(38);

     num.offer(17);

        System.out.println(num);


    }
}
