import java.sql.SQLOutput;

public class NestedLoops {
    public static void main(String[] args) {

        for (int j=1; j<=4; j++){
            for (int i=1; i<=j; i++){
                System.out.println(i);}}
        //When j = 1: The inner loop runs once, printing inner loop i is 1.
        //When j = 2: The inner loop runs twice, printing 1 and 2.
        //When j = 3: The inner loop runs three times, printing 1, 2, and 3.
        //When j = 4: The inner loop runs four times, printing 1, 2, 3, and 4//
        System.out.println("------------------------------");
        for (int j=1; j<=4; j++){
            for (int i=1; i<=j; i++){
                System.out.println(j +" " + i);}}
    }}
        //When j = 1: The inner loop runs once, printing outer loop j is 1.
        //When j = 2: The inner loop runs twice, printing 2 and 2.
        //When j = 3: The inner loop runs three times, printing 3, 3, and 3.
        //When j = 4: The inner loop runs four times, printing 4, 4, 4, and 4