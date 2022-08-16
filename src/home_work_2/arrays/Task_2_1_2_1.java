package home_work_2.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task_2_1_2_1 {
    public static void main(String[] args) {
        int size = 5;
        int bound = 100;
        int[] container = arrayRandom(size, bound);
        System.out.println(Arrays.toString(container));//[34, 77, 55, 21, 57]
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
