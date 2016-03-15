package module_6;

import java.util.Scanner;

public class ExceptionGrowthRunner {
    public static void main(String[] args) {
        System.out.println("Hello! Please, enter your growth in centimetres:");
        final Scanner scanner = new Scanner(System.in);
        final String userInput = scanner.next();

        try {
            final int growth = Integer.parseInt(userInput);
            if (growth < 0 || growth > 250) {
                throw new UnproperGrowthException(growth);
            }
            System.out.println("Your growth is: " + growth + " cm");
        } catch (NumberFormatException ex) {
            System.out.println("[Error]: Growth should be an integer number!");
        } catch (UnproperGrowthException e) {
            System.out.println("[Error]: Entered growth is: '" + e.getGrowthValue() + " cm'. Growth should be between 0 and 250 centimetres");
        }
    }
}