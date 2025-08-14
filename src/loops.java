import java.util.AbstractMap;
import java.util.Scanner;
interface Flyable {
    void fly();  // Abstract method
}

// Second interface
interface Swimmable {
    void swim();  // Abstract method
}

abstract class Animal1 {
    abstract void eat();

}

 class Animal2 {
  void Sleep(){System.out.println("Sleeping..");}}

// Class that implements both interfaces
class Duck extends Animal2 implements Flyable, Swimmable {  // Implements multiple interfaces
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

  //  @Override
   // public void eat() {

    //System.out.println("Duck is Eating");}
}

public class loops {

    public static void main(String[] args) {

        Swimmable n= new Duck();
        n.swim();

    }}