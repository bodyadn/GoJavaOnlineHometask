package webinar_3_4;

import java.util.Scanner;

public class Main {

    public static int readint(String message){
        while (true) {
            try {
                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (Exception E) {
                System.out.println("Wrong number!");
            }
        }
    }

    public static void main(String[] args) {

        int street1 = readint("First street number");
        int avenue1 = readint("First avenue number");
        int street2 = readint("Second street number");
        int avenue2 = readint("Second avenue number");

        Crossroad first = new Crossroad(street1, avenue1);
        Crossroad second = new Crossroad(street2, avenue2);

        ManhettenDistanceCounter manhettenDistanceCounter = new ManhettenDistanceCounter();
        int distance = manhettenDistanceCounter.CountDistance(first, second);

        System.out.println("Full distance is " + distance);
    }
}
