package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1,2,3,4,5,6};
        System.out.println("Массив до сортировки: " + Arrays.toString(firstArray));
        SortsUtils.bubble(firstArray);
        //SortsUtils.shake(firstArray);
        System.out.println("Массив после сортировки: " + Arrays.toString(firstArray));

        int[]secondArray = new int[]{1,1,1,1};
        System.out.println("Массив до сортировки: " + Arrays.toString(secondArray));
        //SortsUtils.bubble(secondArray);
        SortsUtils.shake(secondArray);
        System.out.println("Массив после сортировки: " + Arrays.toString(secondArray));

        int[] thirdArray = new int[]{9,1,5,99,9,9};
        System.out.println("Массив до сортировки: " + Arrays.toString(thirdArray));
        SortsUtils.bubble(thirdArray);
        //SortsUtils.shake(thirdArray);
        System.out.println("Массив после сортировки: " + Arrays.toString(thirdArray));

        int[]fourthArray = new int[]{};
        System.out.println("Массив до сортировки: " + Arrays.toString(fourthArray));
        //SortsUtils.bubble(fourthArray);
        SortsUtils.shake(fourthArray);
        System.out.println("Массив после сортировки: " + Arrays.toString(fourthArray));

        int[] fifthArray = new int[]{6,5,4,3,2,1};
        System.out.println("Массив до сортировки: " + Arrays.toString(fifthArray));
        SortsUtils.bubble(fifthArray);
        //SortsUtils.shake(fifthArray);
        System.out.println("Массив после сортировки: " + Arrays.toString(fifthArray));

        int[] randomArrayBubble = ArraysUtils.arrayRandom(50,100);
        System.out.println("Рандомный массив до сортировки \n" + Arrays.toString(randomArrayBubble));
        SortsUtils.bubble(randomArrayBubble);
        System.out.println("Массив после сортировки пузырьком \n" + Arrays.toString(randomArrayBubble));

        int[] randomArrayShake = ArraysUtils.arrayRandom(50,100);
        System.out.println("Рандомный массив до сортировки \n" + Arrays.toString(randomArrayShake));
        SortsUtils.shake(randomArrayShake);
        System.out.println("Массив после шейкерной сортировки \n" + Arrays.toString(randomArrayShake));

        int[] consoleArrayBubble = ArraysUtils.arrayFromConsole();
        System.out.println("Массив из консоли до сортировки \n" + Arrays.toString(consoleArrayBubble));
        SortsUtils.bubble(consoleArrayBubble);
        System.out.println("Массив после сортировки пузырьком \n" + Arrays.toString(consoleArrayBubble));

        int[] consoleArrayShake = ArraysUtils.arrayFromConsole();
        System.out.println("Массив из консоли до сортировки \n" + Arrays.toString(consoleArrayShake));
        SortsUtils.shake(consoleArrayShake);
        System.out.println("Массив после шейкерной сортировки \n" + Arrays.toString(consoleArrayShake));

    }
}
