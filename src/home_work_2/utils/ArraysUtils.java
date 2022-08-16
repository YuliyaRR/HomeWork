package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
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
        int [] arr = new int[size];
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

    /**
     *Метод создает int-массив заданного размера и заполняет его рандомными числами
     * @param size - размер массива, который необходимо получить
     * @param maxValueExclusion - указывает до какого числа генерировать рандомные числа (не включительно), которые заполнят массив
     * @return - заполненный рандомными числами int-массив
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        Random random = new Random();
        int[] randomArr = new int[size];
        for (int i = 0; i < size; i++) {
            randomArr[i] = random.nextInt(maxValueExclusion);
        }
        return randomArr;
    }
}
