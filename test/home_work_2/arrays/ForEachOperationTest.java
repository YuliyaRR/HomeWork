package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForEachOperationTest {

    @Test
    public void printAllElements() {
        ForEachOperation feo = new ForEachOperation();
        Assertions.assertEquals("Вывести элементы в консоль невозможно.",
                feo.printAllElements(new int[0]));
    }

    @Test
    public void printAllElements2(){
        ForEachOperation feo = new ForEachOperation();
        int[]arr = {1,2,3,0,5};
        Assertions.assertEquals("1 2 3 0 5 ", feo.printAllElements(arr));
    }

    @Test
    public void everySecondElement(){
        ForEachOperation feo = new ForEachOperation();
        Assertions.assertEquals("Вывести второй элемент невозможно.",
                feo.everySecondElement(new int[0]));
    }

    @Test
    public void everySecondElement2(){
        ForEachOperation feo = new ForEachOperation();
        int[]arr = {1};
        Assertions.assertEquals("Массив содержит всего один элемент. " +
                        "Вывести второй элемент невозможно.", feo.everySecondElement(arr));
    }

    @Test
    public void everySecondElement3(){
        ForEachOperation feo = new ForEachOperation();
        int[]arr = {1,2,3,0,5};
        Assertions.assertEquals("2 0 ", feo.everySecondElement(arr));
    }

    @Test
    public void everySecondElement4(){
        ForEachOperation feo = new ForEachOperation();
        int[]arr = {1,2,3,0,5,8};
        Assertions.assertEquals("2 0 8 ", feo.everySecondElement(arr));
    }

    @Test
    public void reverseAllElements(){
        ForEachOperation feo = new ForEachOperation();
        Assertions.assertEquals("Вывести элементы массива в обратном порядке невозможно.",
                feo.reverseAllElements(new int[0]));
    }

    @Test
    public void reverseAllElements2(){
        ForEachOperation feo = new ForEachOperation();
        int[]arr = {1,2,3,0,5};
        Assertions.assertEquals("5 0 3 2 1 ", feo.reverseAllElements(arr));
    }

    @Test
    public void reverseAllElements3(){
        ForEachOperation feo = new ForEachOperation();
        int[]arr = {1};
        Assertions.assertEquals("1 ", feo.reverseAllElements(arr));
    }
}