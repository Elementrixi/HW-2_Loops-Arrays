package main.java.com.hwnumber2;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Integer[] array = getArray();
        System.out.println("Part 1 : ");
        minMaxValue(array);
        sortAscend(array);
        sortRevers(array);
        sumArrayValues(array);
        increaseValues(array);

        Task2 task2 = new Task2();
        task2.findDiagon();
        Task3 task3 = new Task3();
        task3.replaceValues();
    }
    public static Integer[] getArray() {
        Integer array[] = new Integer[20];
        System.out.println("Array values : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        return array;
    }

    public static void minMaxValue(Integer[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            } else if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("\n" + "Min " + min);
        System.out.println("Max " + max);
    }

    public static void sortAscend(Integer[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("\n" + "Sort ascending : ");
        System.out.println(Arrays.toString(array));
    }

    public static void sortRevers(Integer[] array) {
        System.out.println("\n" + "Reversed  sort : ");
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sumArrayValues(Integer[] array) {
        int sum = 0;
        for (int tim1 : array) {
            sum = sum + tim1;
        }
        System.out.println("\n" + "Array values sum : " + sum);
    }

    public static void increaseValues(Integer[] array) {
        System.out.println("\n" + "The square of the array values : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
            System.out.println(array[i]);
        }
    }
}
