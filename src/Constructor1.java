class Student4 {
    int id;
    String name;

    //creating a parameterized constructor-In Java, a constructor is a special method that is used to initialize objects.
    Student4(int i, String n) {
        this.id = i;
        this.name = n;
        System.out.println(id + " " + name);
    }
}

public class Constructor1 {
        public static void main(String[] args) {

            Student4 c1 = new Student4(1, "Raktim");
            Student4 c2 = new Student4(2, "Souvik");

           System.out.println(c1.id+" "+ c2.id);

        }}

