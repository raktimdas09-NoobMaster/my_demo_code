import java.util.Scanner;



public class Recurssion {

        static int n1=0,n2=1,n3=0;
        static void printFibonacci(int count){
            if(count>0){
                n3 = n1 + n2;
                System.out.print(" "+n3);
                n1 = n2;
                n2 = n3;

                printFibonacci(count-1);
            }
        }
        public static void main(String args[]){

            System.out.print(n1+" "+n2);//printing 0 and 1
            printFibonacci(8);//n-2 because 2 numbers are already printed
        }
    }