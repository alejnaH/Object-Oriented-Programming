package Week4.Shapes;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("pink", FillType.FILLED, 5.0);
        Rectangle rectangle = new Rectangle("yellow", FillType.NOT_FILLED, 7.0, 8.0);

        circle.displayInfo();
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("______________________________________");
        rectangle.displayInfo();
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}
