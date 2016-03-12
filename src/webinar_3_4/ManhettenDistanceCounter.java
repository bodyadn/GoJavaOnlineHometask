package webinar_3_4;

public class ManhettenDistanceCounter {

    public int CountDistance (Crossroad first, Crossroad second){
        int numberOfStreets = Math.abs(first.getStreetNumber() - second.getStreetNumber());
        int numberOfAvenues = Math.abs(first.getAvenueNumber() - second.getAvenueNumber());
        return numberOfAvenues + numberOfStreets;
    }
}