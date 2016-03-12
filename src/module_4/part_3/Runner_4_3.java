package module_4.part_3;

public class Runner_4_3 {

    public static final int X1 = 0;
    public static final int Y1 = 0;
    public static final int X2 = 2;
    public static final int Y2 = 2;

    public static void main(String[] args) {

        Point point1 = new Point(X1, Y1);
        Point point2 = new Point(X2, Y2);
        DistanceCounter distanceCounter = new DistanceCounter();
        System.out.println("Distance = " + distanceCounter.CountDistance(point1, point2));
    }
}
