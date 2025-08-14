import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        Comparator<Integer> DigitComm = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 < o2 % 10)
                    return 1; //o1 after o2 =>o2,o1/
                else
                    return - 1;//o1 before o2 =>o1,o2/
            }};
            Comparator<Integer> NumComm = new Comparator<Integer>() {
            public int compare(Integer O1, Integer O2) {
                if (O1  < O2 )
                    return 1; //o1 after o2 =>o2,o1/
                else
                    return - 1;//o1 before o2 =>o1,o2/
            }
        };


            List<Integer> num = new ArrayList<>();
            num.add(23);
            num.add(27);
            num.add(21);
            num.add(35);
            num.add(38);
            System.out.println(num);


        System.out.println("Descending order sorting by collection");
        Collections.sort(num,NumComm);
        System.out.println("Sorting by number     " + num);
        Collections.sort(num,DigitComm);
        System.out.println("Sorting by last digit " + num);



    }



}



