interface a{
    void sound();
}
interface b extends a{
    void light();
}

abstract class c implements b{

    public void sound(){
        System.out.println("hmm");
    }

   /* public void light(){
        System.out.println("Yellow");
    }*/
}
class d extends c{
    public void light(){
        System.out.println("Yellow");
}}

public class Interface {
    public static void main(String[] args) {


        a n1 = new d();
        n1.sound();
    }
}
