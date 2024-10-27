package Week4.Shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, FillType fillType, double radius) {
        super(color,fillType);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("Radius: " + radius);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(double PI, double r) {
        return 2 * PI * r;
    }

    public double calculateCircumference(double r) {
        double PI = 3.14159;
        return 2 * PI * r;
    }

}

