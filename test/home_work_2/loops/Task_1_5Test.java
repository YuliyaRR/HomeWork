package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_5Test {
    @Test
    public void maxDigitInNumber() {
        Assertions.assertEquals(8, Task_1_5.maxDigitInNumber(1148753));
    }
    @Test
    public void maxDigitInNumber2() {
        Assertions.assertEquals(1, Task_1_5.maxDigitInNumber(100));
    }
    @Test
    public void maxDigitInNumber3() {
        Assertions.assertEquals(5, Task_1_5.maxDigitInNumber(1234521));
    }

    @Test
    public void probabilityOfEvenNumbers() {
        int[]arr = {2,5,8,6,3,7,11,15,19,16,12,10,8,6,4,2,0,1,3,5,7,9};
        Assertions.assertEquals(50, Task_1_5.probabilityOfEvenNumbers(arr));
    }

    @Test
    public void probabilityOfEvenNumbers2() {
        int[]arr = {};
        Assertions.assertEquals(0, Task_1_5.probabilityOfEvenNumbers(arr));
    }

    @Test
    public void randomArray(){
        Assertions.assertTrue(Task_1_5.randomArray(10, 4,18).length == 10);
    }

    @Test
    public void randomArray2() {
        int minBound = 4;
        int maxBound = 18;
        int[]arr = Task_1_5.randomArray(10, minBound,maxBound);
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minBound || arr[i] >= maxBound) {
                result = false;
                break;
            }
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void numberOfEvenAndOddDigits(){
        Assertions.assertEquals("четных цифр - 2, нечетных цифр - 2",
                Task_1_5.numberOfEvenAndOddDigits(1245));
    }

    @Test
    public void numberOfEvenAndOddDigits2(){
        Assertions.assertEquals("четных цифр - 4, нечетных цифр - 5",
                Task_1_5.numberOfEvenAndOddDigits(245789910));
    }

    @Test
    public void numberOfEvenAndOddDigits3(){
        Assertions.assertEquals("четных цифр - 1, нечетных цифр - 1",
                Task_1_5.numberOfEvenAndOddDigits(10));
    }

    @Test
    public void fibonacciSeriesElements() {
        Assertions.assertEquals("1 2 3 5 8 13", Task_1_5.fibonacciSeriesElements(6));
    }

    @Test
    public void fibonacciSeriesElements2() {
        Assertions.assertEquals("1", Task_1_5.fibonacciSeriesElements(1));
    }

    @Test
    public void fibonacciSeriesElements3() {
        Assertions.assertEquals("1 2", Task_1_5.fibonacciSeriesElements(2));
    }

    @Test
    public void fibonacciSeriesElements4() {
        Assertions.assertEquals("1 2 3 5 8 13 21 34 55 89 144 233 377",
                Task_1_5.fibonacciSeriesElements(13));
    }

    @Test
    public void allNumbersInRange(){
        Assertions.assertEquals("Диапазон пуст",
                Task_1_5.allNumbersInRange(8,8,0));
    }

    @Test
    public void allNumbersInRange2(){
        Assertions.assertEquals("Неверные границы диапазона",
                Task_1_5.allNumbersInRange(8,2,0));
    }

    @Test
    public void allNumbersInRange3(){
        Assertions.assertEquals("Заданный шаг превышает размер диапазона",
                Task_1_5.allNumbersInRange(2,6,10));
    }

    @Test
    public void allNumbersInRange4(){
        Assertions.assertEquals("2 6",
                Task_1_5.allNumbersInRange(2,6,4));
    }

    @Test
    public void allNumbersInRange5(){
        Assertions.assertEquals("Невозможно заполнить диапазон значениями, шаг равен нулю",
                Task_1_5.allNumbersInRange(2,6,0));
    }

    @Test
    public void allNumbersInRange6(){
        Assertions.assertEquals("2 3 4 5 6 7 8 9 10",
                Task_1_5.allNumbersInRange(2,10,1));
    }

    @Test
    public void allNumbersInRange7(){
        Assertions.assertEquals("0 3 6 9 12 15",
                Task_1_5.allNumbersInRange(0,15,3));
    }

    @Test
    public void turnNumber() {
        Assertions.assertEquals("0021036", Task_1_5.turnNumber(6301200));
    }

    @Test
    public void turnNumber2() {
        Assertions.assertEquals("987654321", Task_1_5.turnNumber(123456789));
    }

    @Test
    public void turnNumber3() {
        Assertions.assertEquals("0", Task_1_5.turnNumber(0));
    }



}
