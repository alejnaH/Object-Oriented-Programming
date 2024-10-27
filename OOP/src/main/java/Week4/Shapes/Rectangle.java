package Week4.Shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, FillType fillType, double width, double height) {
        super(color, fillType);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }


}
