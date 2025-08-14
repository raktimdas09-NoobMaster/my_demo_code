/*public class RecursionExample2{
static int n=0;
public static void p(){
          n++;
        if(n<=5){
        System.out.println("hello ");

        p();}}
        public static void main(String[] args) {
         p();}}*/

/*
public class RecursionExample2 {
    static int n1 = 0, n2 = 1, n3;

    static void printFibo(int count) {
        if (count > 0) {
        n3 = n1 + n2;  // Calculate the next Fibonacci number
        System.out.print(" " + n3);  // Print the current Fibonacci number
        n1 = n2;       // Update n1 to be the previous n2 (for the next iteration)
        n2 = n3;       // Update n2 to be the new Fibonacci number (n3)
        printFibo(count - 1);  // Recursive call with a decremented count
        }
    }

    public static void main(String[] args) {
        int count = 15;  // Number of Fibonacci numbers to print
        System.out.print(n1 + " " + n2);  // Print the first two numbers (0 and 1)
        printFibo(count - 2);  // Call the recursive function with count - 2 since two numbers are already printed
    }
}*/

class RecursionExample2{
        static int factorial(int n){
                if (n != 0)
                        return (n * factorial(n-1));
                else
                        return 1;
        }
        public static void main(String args[]){


           int number=4;//It is the number to calculate factorial
           int fact =  factorial(4);
            System.out.println("Factorial of "+number +" is "+ fact);
            System.out.println("Factorial of " + factorial(4) );
        }
}

