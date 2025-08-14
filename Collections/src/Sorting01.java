import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class mynumcom implements Comparator<Integer>{


    public int compare (Integer o1, Integer o2){
        return o2-o1;
    }
}
class mydigitcomm implements Comparator<Integer>{
    public int compare (Integer O1, Integer O2){
        return (O2 % 10) - (O1 % 10);
    }}

public class Sorting01 {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(23);
        num.add(27);
        num.add(21);
        num.add(35);
        num.add(38);
        System.out.println(num);

        System.out.println("Descending order sorting");
        num.sort(new mynumcom());
        System.out.println("Sorting by number     " + num);
        num.sort(new mydigitcomm());
        System.out.println("Sorting by last digit " + num);

    }
}
