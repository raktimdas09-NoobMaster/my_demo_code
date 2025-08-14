abstract class Animal{

    public abstract void Eye();  // Abstract method: it can't have a body, just the method signature.

    public void Wolk(){           //Regular method

        System.out.println("Two Legs or Four legs");
    }}

     class Dog extends Animal{

        @Override
        public void Eye() {
            System.out.println("two black peach eye");
        }

    }

    class Cat extends Animal{


        @Override
        public void Eye() {
            System.out.println("Two white eye");
        }
    }


public class ABSTRACTION {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.Eye();
        d1.Wolk();
    }
}