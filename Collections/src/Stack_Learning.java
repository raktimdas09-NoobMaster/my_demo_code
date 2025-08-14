import java.util.Stack;

public class Stack_Learning {

    public static void main(String[] args) {

        Stack<String> Animal = new Stack<>();

        Animal.push("lion");
        Animal.push("Tiger");
        Animal.push("Cat");
        Animal.push("Dog");
        Animal.push("Mouse");
        System.out.println(Animal); //Print the entire Stack
        Animal.set(1,"Liger"); // update the string in index 1
        System.out.println(Animal);
        Animal.add(5,"Tom"); // add the string in index 5
        System.out.println(Animal);
        Animal.peek();   //Peek the top element without removing it
        System.out.println(Animal.peek()); //Print the top element of the Stack (will show "Tom")
        Animal.pop(); //Pop the top element (removes the last element)-Mouse
        System.out.println(Animal.pop());// Print the element that was popped (will show "Dog")
        System.out.println(Animal.peek());// Peek the top element again after popping
        Animal.set(2,"Higer");
        System.out.println(Animal);

        for(int i= 0; i< Animal.size(); i++)
        { System.out.println( "My Animals are-"+ Animal.get(i));}



    }
}
