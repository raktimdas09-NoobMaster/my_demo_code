class Employee{
    private int sal;
    private String name;


    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setSal(int i) {
        this.sal = i;
    }

    public int getSal() {
        return sal;
    }
}

public class GetSet {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setName("Super");
        e1.setSal(2300);
        System.out.println("Name: " + e1.getName() + ", Salary: " + e1.getSal());
    }
}
