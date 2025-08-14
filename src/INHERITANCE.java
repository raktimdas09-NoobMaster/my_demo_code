class Shape {

    public void area() {
        System.out.println("Display Area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h)
    {
        System.out.println(0.5 * l * h);
    }}

class EqTriangle extends Triangle {
    public void area(int l, int h)
    {
        System.out.println(0.5 * l * h);
    }}

class Circle extends Shape {

    public void area( int r)
    {
        System.out.println(3.174 * r * r);
    }}

public class INHERITANCE {
    public static void main(String[] args) {
        // Create instances of different shapes
       Shape s1 = new Shape();
       Circle c1 = new Circle();
        Triangle t1 = new Triangle();
        EqTriangle eqT1 = new EqTriangle();

        // Call the methods
        s1.area(); // Calls Shape's area() method
        c1.area(4); // Calls Circle's area() method
        t1.area(4, 5); // Calls Triangle's area() method
        eqT1.area(4, 5); // Calls EqTriangle's area() method (overridden)

    }
}
