package home_work_2.utils;

public class SortsUtils {

    /**
     * Метод сортирует переданный ему массив при помощи алгоритма пузырьковая сортировка
     * @param arr - int-массив
     */
    public static void bubble(int[] arr){
        if(arr == null) {
            throw new NullPointerException("Переданный массив равен null");
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    /**
     * Метод сортирует переданный ему массив при помощи алгоритма шейкерная сортировка
     * @param arr - int-массив
     */
    public static void shake(int[] arr) {
        if(arr == null) {
            throw new NullPointerException("Переданный массив равен null");
        }

        int start = 0;
        int end = arr.length - 1;
        boolean doSort = true;// индикатор сортировки

        while ((start < end) && doSort) {//пока start != end и пока происходили сортировки
            doSort = false; //сортировка не требуется

            for (int i = start; i < end; i++) {
                if(arr[i] > arr[i +1]){
                    int temp = arr[i];
                    arr[i] = arr[i +1];
                    arr[i +1] = temp;
                    doSort = true;// сортировка была
                }
            }
            end--;

            for (int i = end; i > start ; i--) {
                if(arr[i] < arr[i - 1]){
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    doSort = true;
                }
            }
            start++;
        }

    }

}
