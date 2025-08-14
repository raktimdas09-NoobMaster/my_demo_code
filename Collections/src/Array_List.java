// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Array_List {
    public static void main(String[] args) {

      List<String> name= new ArrayList<>();
        name.add("Ab");
        name.add("Ac");
        name.add("ff");
        System.out.println("My name array-" + name);

        name.add(1,"SS");// adding string in index 1
        System.out.println("A name is added at index 1 -"+ name);


        ArrayList<Integer> num= new ArrayList();
        num.add(1);
        num.add(2);
        num.add(3);
        System.out.println("My numbers-" + num);// shows array
        num.add(4);
        System.out.println("A number is added in Array-"+ num);// shows array and add 4 in index 3
       num.add(1,3);
        System.out.println("in index 1, added 3" + num);// in index 1 add 3 and follow the array, not replacing

        num.set(2,5);
        System.out.println("Updated the value(5) in index 2" + num);// update the value(5) in index 2
        System.out.println("find  element at index 02 =" + num.get(2));// find  element from array
        ArrayList<Integer> num1= new ArrayList();
        num1.add(6);
        num1.add(7);
        num.addAll(num1);
        System.out.println("merge two lists "+ num);// merge two lists
        Collections.sort( num);
        System.out.println("Sorted list " + num);
        num.sort(null);
        System.out.println("Sorted list " + num);
        System.out.println("How many elements in array " + num.size());
        System.out.println("element 4 present at index =" + num.indexOf(4));
        System.out.println("is element 4 present?  =" + num.contains(4));
        num.remove(1);
        System.out.println("removing element by index number 01 ="+num);// removing element by index number
        num.remove(Integer.valueOf(3));
        System.out.println(num);// removing element by its own value

for(int i= 0; i<num.size(); i++) //use "size"
{ System.out.println( num.get(i));}

for(int a : num)
{
    System.out.print(a+" ");}

        System.out.print("Reversed list: ");
        for (int i = num.size() - 1; i >= 0; i--) {
            System.out.print(num.get(i) + " ");
        }



        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(10,"Raktim"));
        list.add(new Student(10,"Rahul"));
        System.out.println(list);

    }}
