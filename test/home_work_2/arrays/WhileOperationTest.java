package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhileOperationTest {

    @Test
    public void printAllElements() {
        WhileOperation wo = new WhileOperation();
        Assertions.assertEquals("Вывести элементы в консоль невозможно.",
                wo.printAllElements(new int[0]));
    }

    @Test
    public void printAllElements2(){
        WhileOperation wo = new WhileOperation();
        int[]arr = {1,2,3,0,5};
        Assertions.assertEquals("1 2 3 0 5 ", wo.printAllElements(arr));
    }

    @Test
    public void everySecondElement(){
        WhileOperation wo = new WhileOperation();
        Assertions.assertEquals("Вывести второй элемент невозможно.",
                wo.everySecondElement(new int[0]));
    }

    @Test
    public void everySecondElement2(){
        WhileOperation wo = new WhileOperation();
        int[]arr = {1};
        Assertions.assertEquals("Массив содержит всего один элемент. " +
                        "Вывести второй элемент невозможно.", wo.everySecondElement(arr));
    }

    @Test
    public void everySecondElement3(){
        WhileOperation wo = new WhileOperation();
        int[]arr = {1,2,3,0,5};
        Assertions.assertEquals("2 0 ", wo.everySecondElement(arr));
    }

    @Test
    public void everySecondElement4(){
        WhileOperation wo = new WhileOperation();
        int[]arr = {1,2,3,0,5,8};
        Assertions.assertEquals("2 0 8 ", wo.everySecondElement(arr));
    }

    @Test
    public void reverseAllElements(){
        WhileOperation wo = new WhileOperation();
        Assertions.assertEquals("Вывести элементы массива в обратном порядке невозможно.",
                wo.reverseAllElements(new int[0]));
    }

    @Test
    public void reverseAllElements2(){
        WhileOperation wo = new WhileOperation();
        int[]arr = {1,2,3,0,5};
        Assertions.assertEquals("5 0 3 2 1 ", wo.reverseAllElements(arr));
    }

    @Test
    public void reverseAllElements3(){
        WhileOperation wo = new WhileOperation();
        int[]arr = {1};
        Assertions.assertEquals("1 ", wo.reverseAllElements(arr));
    }
}