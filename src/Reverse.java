import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Any name - ");
        String name = Sc.nextLine();


    String reversedStr =" " ;

for (int i = 0; i < name.length(); i++) {
        reversedStr = name.charAt(i)+ "" + reversedStr;}
        System.out.println("Reversed string: "+ reversedStr);


        System.out.print("Reversed string: ");
        for (int i = name.length()-1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
}  }
