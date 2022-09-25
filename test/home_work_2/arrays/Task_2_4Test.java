package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task_2_4Test {

    @Test
    public void sumOfEvenPositiveArrayElements(){
        int[]arr = {16, 22, 11, -6, 0, 33, 9, -100};
        Assertions.assertEquals(38, Task_2_4.sumOfEvenPositiveArrayElements(arr));
    }

    @Test
    public void sumOfEvenPositiveArrayElements2(){
        int[]arr = {0, -22, -11, 0, 0, 33, 9, -100};
        Assertions.assertEquals(0, Task_2_4.sumOfEvenPositiveArrayElements(arr));
    }

    @Test
    public void sumOfEvenPositiveArrayElements3(){
        int[]arr = {};
        Assertions.assertEquals(0, Task_2_4.sumOfEvenPositiveArrayElements(arr));
    }

    @Test
    public void sumOfEvenPositiveArrayElements4(){
        int[]arr = null;
        Throwable thrown = assertThrows(NullPointerException.class,
                () -> Task_2_4.sumOfEvenPositiveArrayElements(arr));
        assertEquals("Переданный массив равен null", thrown.getMessage());
    }

    @Test
    public void maxElementWithEvenIndex(){
        int[]arr = {16, 22, 11, -6, 0, 33, 9, -100};
        Assertions.assertEquals(16, Task_2_4.maxElementWithEvenIndex(arr));
    }

    @Test
    public void maxElementWithEvenIndex2(){
        int[]arr = {-16, 22, 11, -6, 0, 33, 9, 100, 699};
        Assertions.assertEquals(699, Task_2_4.maxElementWithEvenIndex(arr));
    }

    @Test
    public void maxElementWithEvenIndex3(){
        int[]arr = {-16, -22, -11, -6, 0, -33, -9, -100, -699};
        Assertions.assertEquals(0, Task_2_4.maxElementWithEvenIndex(arr));
    }

    @Test
    public void maxElementWithEvenIndex4(){
        int[]arr = {-16, -22, -11, -6, -33, -9, -100, -699};
        Assertions.assertEquals(-11, Task_2_4.maxElementWithEvenIndex(arr));
    }

    @Test
    public void lessArithmeticMean() {
        int[]arr = {73, 42, 8, 41, 94, 31, 89, 73, 19, 30};
        Assertions.assertEquals("42 8 41 31 19 30 ", Task_2_4.lessArithmeticMean(arr));
    }

    @Test
    public void lessArithmeticMean2() {
        int[]arr = {-16, -22, -11, -6, 0, -33, -9, -100, -699};
        Assertions.assertEquals("-100 -699 ", Task_2_4.lessArithmeticMean(arr));
    }

    @Test
    public void lessArithmeticMean3() {
        int[]arr = {-16, 22, 11, -6, 0, 33, 9, 100, 699};
        Assertions.assertEquals("-16 22 11 -6 0 33 9 ", Task_2_4.lessArithmeticMean(arr));
    }

    @Test
    public void lessArithmeticMean4() {
        int[]arr = {1,1,1,1};
        Assertions.assertEquals("Все элементы массива равны", Task_2_4.lessArithmeticMean(arr));
    }

    @Test
    public void lessArithmeticMean5() {
        int[]arr = null;
        Assertions.assertNull(Task_2_4.lessArithmeticMean(arr));
    }

    @Test
    public void lessArithmeticMean6() {
        int[]arr = {};
        Assertions.assertEquals("Массив пуст", Task_2_4.lessArithmeticMean(arr));
    }

    @Test
    public void twoMinArrayElements() {
        int[]arr = null;
        Assertions.assertNull(Task_2_4.twoMinArrayElements(arr));
    }

    @Test
    public void twoMinArrayElements2() {
        int[]arr = {};
        Assertions.assertEquals("Массив пуст", Task_2_4.twoMinArrayElements(arr));
    }

    @Test
    public void twoMinArrayElements3() {
        int[]arr = {9, 2, 6, 0, 14, 85, -10};
        Assertions.assertEquals("-10 0", Task_2_4.twoMinArrayElements(arr));
    }

    @Test
    public void twoMinArrayElements4() {
        int[]arr = {9, 2, 6, 10, 2, 85, 10};
        Assertions.assertEquals("2 2", Task_2_4.twoMinArrayElements(arr));
    }

    @Test
    public void arrayCompression() {
        int[]arr = null;
        Assertions.assertNull(Task_2_4.arrayCompression(arr, 2,3));
    }

    @Test
    public void arrayCompression2() {
        int[]arr = {2,3,4,5,7};
        Assertions.assertArrayEquals(arr, Task_2_4.arrayCompression(arr, 5,2));
    }

    @Test
    public void arrayCompression3() {
        int[]arr = {};
        Assertions.assertArrayEquals(arr, Task_2_4.arrayCompression(arr, 2,4));
    }

    @Test
    public void arrayCompression4() {
        int[]arr = {-2,6,4,5,8,11,19};
        int[]arrExpected = {-2, 11, 19, 0, 0, 0, 0};
        Assertions.assertArrayEquals(arrExpected, Task_2_4.arrayCompression(arr, 4,8));
    }

    @Test
    public void sumAllDigitsInArray(){
        int[] arr = {12,104,81};
        Assertions.assertEquals(17, Task_2_4.sumAllDigitsInArray(arr));
    }

    @Test
    public void sumAllDigitsInArray2(){
        int[] arr = {0, -16, 11, -99, 5, 32};
        Assertions.assertEquals(37, Task_2_4.sumAllDigitsInArray(arr));
    }

    @Test
    public void sumAllDigitsInArray3(){
        int[] arr = null;
        Throwable thrown = assertThrows(NullPointerException.class,
                () -> Task_2_4.sumAllDigitsInArray(arr));
        assertEquals("Переданный массив равен null", thrown.getMessage());
    }

    @Test
    public void sumAllDigitsInArray4(){
        int[] arr = {};
        Throwable thrown = assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> Task_2_4.sumAllDigitsInArray(arr));
        Assertions.assertEquals("Переданный массив имеет нулевую длину", thrown.getMessage());
    }

    @Test
    public void sumAllDigitsInArray5(){
        int[] arr = {9};
        Assertions.assertEquals(9, Task_2_4.sumAllDigitsInArray(arr));
    }









}
