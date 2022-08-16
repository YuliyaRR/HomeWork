package home_work_2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2_1_1_1 {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        System.out.println(Arrays.toString(container));//[4, 17, 32]
    }

    /**
     * Метод создает int-массив, запрашивая у пользователя его размер и значения для каждого элемента массива
     * @return - заполненный int-массив
     */
    public static int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива"); //3
            size = scanner.nextInt();
            if (size < 0) {
                System.out.println("Размер массива должены быть положительным числом");
            }
        } while (size < 0);
        System.out.printf("Будет создан массив размера %d \n", size);
        int[] arr = new int[size];
        if (size == 0) {
            System.out.println("Массив пуст");
        } else {
            System.out.println("Заполнение массива");
            for (int i = 0; i < size; i++) {
                System.out.printf("Введите %d-й элемент массива ", i);
                arr[i] = scanner.nextInt();//4 17 32
            }
        }
        return arr;
    }
}
