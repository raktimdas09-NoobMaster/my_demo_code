class   Students {
    int age;
   String name;

    public void Printinfo() {

        System.out.print("Name: " + this.name);
        System.out.println(", Age: " +this.age);
    }
    //This method doesn't take any parameters.
    //It simply prints the values of the instance variables name and age of the Students object.
    //"this" keyword is used here to refer to the instance variables (name and age) of the current Students object.
    //However, you could omit this and the code would work the same way, because within the class methods,
    //  the instance variables are accessible directly by their names.

    public void Printinfo( int a, String name ) {
        this.name = name;
       this. age = a;
    }
    //This method is designed to update the object's instance variables (name and age) using the arguments passed to it

    public void Printinfo1(int age, String name) {

        System.out.print("Name: " + name);
        System.out.println(", Age: " +age);
    }
    //When this method is called, it will print the name and age values that are passed to it as arguments.
    //Not using the propeties of Students class,It prints the name and age provided as arguments to the method,
    // not the instance variables.
}
public class ClassMethod {
    public static void main(String[] args) {
        Students s1 = new Students();

       s1.age= 33;
       s1.name= "Raktim";
       s1.Printinfo(); //Prints: Name,Age of S1 objet

       s1.Printinfo(34, "Souvik"); //Updates s1's age and name
       System.out.println("Name: " + s1.name + ", Age: " + s1.age);  //Print updated value

       s1.Printinfo1(35, "Koushal");



    }
}




