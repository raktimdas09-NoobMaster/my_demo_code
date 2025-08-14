
import java.util.*;
class Student{
    int rollno;
    String name;
  //  int age;
    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
     //   this.age=age;

    }



    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }
}




/*
class ArrayList_Class{
    public static void main(String args[]){
        //Creating user-defined class objects
        Student s1=new Student(101,"Sonoo",23);
        Student s2=new Student(102,"Ravi",21);
        Student s3=new Student(103,"Hanumat",25);
        //creating arraylist
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);


        for (int i = 0; i < al.size(); i++) {

            System.out.println(al.get(i));}


        }
    }

*/
