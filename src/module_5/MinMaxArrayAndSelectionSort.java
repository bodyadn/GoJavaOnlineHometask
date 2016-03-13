package module_5; //module_5_1

import java.util.Scanner;

public class MinMaxArrayAndSelectionSort {

    public static int enterInt(String message){
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

        //заполняем массив значениями

        int countNumberArray = enterInt("Enter count of Array number:");
        int[] intArray = new int[countNumberArray];

        // и сразу ищем максимум и минимум

        int minArrayNumber = intArray[0];
        int maxArrayNumber = intArray[0] ;

        for (int i = 0; i < intArray.length; i++) {
            intArray[i]= enterInt("Enter array element " + i);
            if (intArray[i] < minArrayNumber) {
                minArrayNumber = intArray[i];
            }
            if (intArray[i] > maxArrayNumber) {
                maxArrayNumber = intArray[i];
            }
        }

        System.out.println("Maximum array member " + maxArrayNumber);
        System.out.println("Minimum array member " + minArrayNumber);

        //сортируем массив алгоритмом Selection sort

        System.out.println("Sorted Array:");

        for (int i = 0; i < intArray.length; i++) {

            // устанавливаем начальное значение минимального индекса

            int min_i = i;

            //находим индекс минимального элемента

            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < intArray[min_i]) {
                    min_i = j;
                }
            }

            // меняем значения местами

            int temp = intArray[i];
            intArray[i] = intArray[min_i];
            intArray[min_i] = temp;
            System.out.println(intArray[i]);
        }
    }
}
