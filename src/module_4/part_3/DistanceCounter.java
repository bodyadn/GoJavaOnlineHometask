package module_4.part_3;

public class DistanceCounter {

    public double CountDistance (Point point1, Point point2) {
        return Math.pow((Math.pow((point1.getX() - point2.getX()), 2) + Math.pow((point1.getY() - point2.getY()), 2)), 0.5);
    }
}
