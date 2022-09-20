package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForOperationTest {

    @Test
    public void printAllElements() {
        ForOperation fo = new ForOperation();
        Assertions.assertEquals("Вывести элементы в консоль невозможно.",
                fo.printAllElements(new int[0]));
    }

    @Test
    public void printAllElements2(){
        ForOperation fo = new ForOperation();
        int[]arr = {1,2,3,0,5};
        Assertions.assertEquals("1 2 3 0 5 ", fo.printAllElements(arr));
    }

    @Test
    public void everySecondElement(){
        ForOperation fo = new ForOperation();
        Assertions.assertEquals("Вывести второй элемент невозможно.",
                fo.everySecondElement(new int[0]));
    }

    @Test
    public void everySecondElement2(){
        ForOperation fo = new ForOperation();
        int[]arr = {1};
        Assertions.assertEquals("Массив содержит всего один элемент. " +
                        "Вывести второй элемент невозможно.", fo.everySecondElement(arr));
    }

    @Test
    public void everySecondElement3(){
        ForOperation fo = new ForOperation();
        int[]arr = {1,2,3,0,5};
        Assertions.assertEquals("2 0 ", fo.everySecondElement(arr));
    }

    @Test
    public void everySecondElement4(){
        ForOperation fo = new ForOperation();
        int[]arr = {1,2,3,0,5,8};
        Assertions.assertEquals("2 0 8 ", fo.everySecondElement(arr));
    }

    @Test
    public void reverseAllElements(){
        ForOperation fo = new ForOperation();
        Assertions.assertEquals("Вывести элементы массива в обратном порядке невозможно.",
                fo.reverseAllElements(new int[0]));
    }

    @Test
    public void reverseAllElements2(){
        ForOperation fo = new ForOperation();
        int[]arr = {1,2,3,0,5};
        Assertions.assertEquals("5 0 3 2 1 ", fo.reverseAllElements(arr));
    }

    @Test
    public void reverseAllElements3(){
        ForOperation fo = new ForOperation();
        int[]arr = {1};
        Assertions.assertEquals("1 ", fo.reverseAllElements(arr));
    }
}