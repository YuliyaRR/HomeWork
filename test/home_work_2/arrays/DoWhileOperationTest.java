package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoWhileOperationTest {
    @Test
    public void printAllElements(){
        DoWhileOperation dwo = new DoWhileOperation();
        Assertions.assertEquals("Вывести элементы в консоль невозможно.",
                dwo.printAllElements(new int[0]));
    }

    @Test
    public void printAllElements2(){
        DoWhileOperation dwo = new DoWhileOperation();
        int[]arr = {1,2,3,0,5};
        Assertions.assertEquals("1 2 3 0 5 ", dwo.printAllElements(arr));
    }

    @Test
    public void everySecondElement(){
        DoWhileOperation dwo = new DoWhileOperation();
        Assertions.assertEquals("Вывести второй элемент невозможно.", dwo.everySecondElement(new int[0]));
    }

    @Test
    public void everySecondElement2(){
        DoWhileOperation dwo = new DoWhileOperation();
        int[]arr = {1};
        Assertions.assertEquals("Массив содержит всего один элемент. " +
                        "Вывести второй элемент невозможно.", dwo.everySecondElement(arr));
    }

    @Test
    public void everySecondElement3(){
        DoWhileOperation dwo = new DoWhileOperation();
        int[]arr = {1,2,3,0,5};
        Assertions.assertEquals("2 0 ", dwo.everySecondElement(arr));
    }

    @Test
    public void everySecondElement4(){
        DoWhileOperation dwo = new DoWhileOperation();
        int[]arr = {1,2,3,0,5,8};
        Assertions.assertEquals("2 0 8 ", dwo.everySecondElement(arr));
    }

    @Test
    public void reverseAllElements(){
        DoWhileOperation dwo = new DoWhileOperation();
        Assertions.assertEquals("Вывести элементы массива в обратном порядке невозможно.",
                dwo.reverseAllElements(new int[0]));
    }

    @Test
    public void reverseAllElements2(){
        DoWhileOperation dwo = new DoWhileOperation();
        int[]arr = {1,2,3,0,5};
        Assertions.assertEquals("5 0 3 2 1 ", dwo.reverseAllElements(arr));
    }

    @Test
    public void reverseAllElements3(){
        DoWhileOperation dwo = new DoWhileOperation();
        int[]arr = {1};
        Assertions.assertEquals("1 ", dwo.reverseAllElements(arr));
    }
}
