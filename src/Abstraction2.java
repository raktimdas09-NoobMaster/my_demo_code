abstract class car{
    public abstract void drive();
    public abstract void fly();

    public void muisc(){
        System.out.println(" playing music");
    }

}
 abstract class wagonR extends car{

     @Override
     public void drive() {
         System.out.println(" With Good speed");
     }}

 class UpdatedWagnoR extends wagonR{
    public void fly(){
        System.out.println(" can fly");
    }
}

 public class Abstraction2 {
    public static void main(String[] args) {

     car c1 = new UpdatedWagnoR();

c1.muisc();
c1.drive();
    }
}
