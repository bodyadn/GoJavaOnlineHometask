package module_5;

import java.util.Scanner;

public class MinMaxArrayAndSelectionSort {

    public static int enterInt(String message) {
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

        // вводим элеементы массива

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = enterInt("Enter array element " + i);
        }

        // ищем максимум и минимум

        int minArrayNumber = intArray[0];
        int maxArrayNumber = intArray[0];

        for (int i : intArray) {
            if (i < minArrayNumber) {
                minArrayNumber = i;
            }
            if (i > maxArrayNumber) {
                maxArrayNumber = i;
            }
        }

        // вставка для ДЗ модуля 6_1

        try {
            intArray[3] = 100;
            System.out.println("3-th array's element is changed");
            if (intArray[3] > maxArrayNumber) {
                maxArrayNumber = intArray[3];
            }
            if (intArray[3] < minArrayNumber) {
                minArrayNumber = intArray[3];
            }
        } catch (ArrayIndexOutOfBoundsException Ex) {
            System.out.println("Нет такого элемента в массиве! Замена не произведена!");
            System.out.println("Исключение - " + Ex);
        }

        //конец вставки для ДЗ модуля 6_1

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
