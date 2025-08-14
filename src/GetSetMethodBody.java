class Employee1{
private int sal;
private String name;


    public void setName(String n) {

        this.name = n;
    }

    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }

    public void setSal(int i) {
        this.sal = i;
    }

    public int getSal() {
        System.out.println("Salary: " + sal);
        return sal;
    }
}


public class GetSetMethodBody {

    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        e1.setName("Super");
        e1.setSal(2300);
        e1.getName();
        e1.getSal();


    }
}
