package module_4.part_1;

public class Runner_4_1 {

    // circle
    public static final int RADIUS = 2;
    // rectangle
    public static final int SIDE_1 = 4;
    public static final int SIDE_2 = 2;
    // triangle
    public static final int LINE_1 = 5;
    public static final int LINE_2 = 4;
    public static final int LINE_3 = 3;

    public static void main(String[] args) {

        Circle circle = new Circle(RADIUS);
        Rectangle rectangle = new Rectangle(SIDE_1, SIDE_2);
        Triangle triangle = new Triangle(LINE_1, LINE_2, LINE_3);
        SquareCalculator squareCalculator = new SquareCalculator();
        System.out.println("Circle square = " + squareCalculator.circleSquare(circle));
        System.out.println("Rectangle square = " + squareCalculator.rectangleSquare(rectangle));
        System.out.println("Triangle square = " + squareCalculator.triangleSquare(triangle));

    }
}
