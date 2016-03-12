package module_4.part_1;

public class SquareCalculator {

    public double circleSquare (Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(),2);
    }

    public double rectangleSquare (Rectangle rectangle) {
        return rectangle.getSide1() * rectangle.getSide2();
    }

    public double triangleSquare (Triangle triangle) {
        double a = triangle.getLine1();
        double b = triangle.getLine2();
        double c = triangle.getLine3();
        double p = (a + b + c)/2;
        return Math.pow((p * (p - a) * (p - b) * (p - c)), 0.5);
    }
}
