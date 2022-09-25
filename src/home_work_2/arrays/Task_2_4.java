package home_work_2.arrays;

public class Task_2_4 {

    /**
     * Метод возвращает сумму четных положительных элементов массива
     * @param arr - int-массив
     * Throws:NullPointerException - если переданный массив равен null
     * @return - сумма четных положительных элементов
     */
    public static int sumOfEvenPositiveArrayElements (int[] arr) {
        int sum = 0;

        if(arr == null) {
            throw new NullPointerException("Переданный массив равен null");
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0 && arr[i] > 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    /**
     * Метод возвращает максимальный из элементов массива с четными индексами
     * @param arr - массив для перебора элементов
     * @return - int, максимальный из элементов массива с четным индексом
     */
    public static int maxElementWithEvenIndex (int[]arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(i % 2 == 0 && arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Метод возвращает элементы массива, значение которых меньше среднего арифметического от всех элементов массива
     * @param arr - int-массив для перебора
     * @return - строка, содержащая все элементы, значение которых меньше среднего арифметического
     */
    public static String lessArithmeticMean (int[]arr){
        if (arr == null) {
            return null;
        }

        if (arr.length == 0) {
            return "Массив пуст";
        }

        int arithmeticMean;
        int sumAll = 0;
        StringBuilder stb = new StringBuilder();

        for (int a: arr) {
            sumAll = sumAll + a;
        }

        arithmeticMean = sumAll / arr.length;

        for (int a: arr) {
            if(a < arithmeticMean) {
                stb.append(a).append(" ");
            }
        }

        if(stb.length() == 0) {
            return "Все элементы массива равны";
        }
        return stb.toString();
    }

    /**
     * Метод возвращает два наименьших элемента в массиве
     * @param arr - int-массив для перебора
     * @return - строка, содержащая два наименьших элемента массива
     */
    public static String twoMinArrayElements (int[]arr) {
        if (arr == null) {
            return null;
        }

        if (arr.length == 0) {
            return "Массив пуст";
        }

        int min;
        int nextMin;
        String result;

        if (arr[0] < arr[1]) {
            min = arr[0];
            nextMin = arr[1];
        } else {
            min = arr[1];
            nextMin = arr[0];
        }

        for (int i = 2; i <arr.length ; i++) {
            if (arr[i] < min) {
                nextMin = min;
                min = arr[i];
            } else {
                if (arr[i] < nextMin) {
                    nextMin = arr[i];
                }
            }
        }
        result = String.format("%d %d", min, nextMin);
        return result;
    }

    /**
     * Метод сжимает массив, удаляя элементы, принадлежащие интервалу. Данные элементы заменяются на 0 и перемещаются в конец массива
     * @param arr - массив для сжатия
     * @param a - начало интервала(включая а)
     * @param b - конец интервала (включая b)
     * @return - новый массив, не содержащий элементы, принадлежащие интервалу
     */
    public static int[] arrayCompression (int[]arr, int a, int b) {
        if (arr == null) {
            return null;
        }

        if (arr.length == 0  || a > b) {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= a && arr[i] <= b){
                arr[i] = 0;
            }
        }

        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                if (arr[j] != 0) {
                    newArr[i] = arr[j];
                    arr[j] = 0;
                    break;
                }
            }
        }
        return newArr;
    }

    /**
     * Метод вычисляет сумму всех цифр массива
     * @param arr - исследуемый массив
     * @return - int, сумма всех цифр массива
     */
    public static int sumAllDigitsInArray(int[]arr) {
        if(arr == null) {
            throw new NullPointerException("Переданный массив равен null");
        }

        if(arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Переданный массив имеет нулевую длину");
        }

        int sum = 0;
        int num;
        for (int a : arr) {
            num = Math.abs(a);
            while (num!=0) {
                int rest = num % 10;
                sum = sum + rest;
                num = num / 10;
            }
        }
        return sum;
    }
}
