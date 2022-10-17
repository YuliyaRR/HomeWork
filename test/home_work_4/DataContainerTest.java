package home_work_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class DataContainerTest {
    @Test
    public void makeNewLongArray() {
        Integer [] data = {1, 5, 9};
        Integer [] expected = {1, 5, 9, null};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertArrayEquals(expected, dataContainer.makeNewLongArray(data));
    }

    @Test
    public void makeNewLongArray2() {
        Integer [] data = {};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertEquals(1, dataContainer.makeNewLongArray(data).length);
    }

    @Test
    public void add() {
        Integer [] data = {1, 5, 9, null};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertEquals(3, dataContainer.add(8));
    }

    @Test
    public void add2() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertEquals(4, dataContainer.add(8));
    }

    @Test
    public void add3() {
        String [] data1 = {};
        DataContainer<String> dataContainer = new DataContainer<>(data1);
        Assertions.assertEquals(0, dataContainer.add("Hello"));
    }

    @Test
    public void add4() {
        String [] data1 = {};
        DataContainer<String> dataContainer = new DataContainer<>(data1);
        Assertions.assertEquals(-1, dataContainer.add(null));
    }

    @Test
    public void add5() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        DataContainer[] data3 = {dataContainer, null, dataContainer2, null};
        DataContainer<DataContainer> dataContainer3 = new DataContainer<>(data3);
        Assertions.assertEquals(1, dataContainer3.add(dataContainer2));
    }

    @Test
    public void get() {
        Integer [] data = {1, 5, 9, 0, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertEquals(8, dataContainer.get(4));
    }

    @Test
    public void get2() {
        Integer [] data = {1, 5, 9, 8, 0};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertNull(dataContainer.get(5));
    }

    @Test
    public void get3() {
        String [] data = {"Hello"};
        DataContainer<String> dataContainer = new DataContainer<>(data);
        Assertions.assertEquals("Hello", dataContainer.get(0));
    }

    @Test
    public void get4() {
        String [] data = {"Hello"};
        DataContainer<String> dataContainer = new DataContainer<>(data);
        Assertions.assertNull(dataContainer.get(10));
    }

    @Test
    public void get5() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        DataContainer[] data3 = {dataContainer, dataContainer2, dataContainer2};
        DataContainer<DataContainer> dataContainer3 = new DataContainer<>(data3);
        Assertions.assertEquals(dataContainer2, dataContainer3.get(1));
    }

    @Test
    public void get6() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        DataContainer[] data3 = {dataContainer, dataContainer2, dataContainer2};
        DataContainer<DataContainer> dataContainer3 = new DataContainer<>(data3);
        Assertions.assertNull(dataContainer3.get(10));
    }

    @Test
    public void getItem() {
        Integer [] data = {1, 5, 9, 0, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertArrayEquals(data, dataContainer.getItems());
    }

    @Test
    public void getItem2() {
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Assertions.assertArrayEquals(data2, dataContainer2.getItems());
    }

    @Test
    public void getItem3() {
        String [] data2 = {};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Assertions.assertArrayEquals(data2, dataContainer2.getItems());
    }

    @Test
    public void getItem4() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        DataContainer[] data3 = {dataContainer, dataContainer2, dataContainer2};
        DataContainer<DataContainer> dataContainer3 = new DataContainer<>(data3);
        Assertions.assertArrayEquals(data3, dataContainer3.getItems());
    }

    @Test
    public void makeNewShortArray() {
        Integer [] data = {1, 5, 8, 9};
        Integer [] expected = {1, 5, 9};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertArrayEquals(expected, dataContainer.makeNewShortArray(data, 2));
    }

    @Test
    public void makeNewShortArray2() {
        Integer [] data = {1, 5, 8, 9};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertEquals(3, dataContainer.makeNewShortArray(data, 2).length);
    }

    @Test
    public void deleteIndex() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertTrue(dataContainer.delete(2));
    }

    @Test
    public void deleteIndex2() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertFalse(dataContainer.delete(12));
    }

    @Test
    public void deleteIndex3() {
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Assertions.assertTrue(dataContainer2.delete(0));
    }

    @Test
    public void deleteIndex4() {
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Assertions.assertFalse(dataContainer2.delete(12));
    }

    @Test
    public void deleteIndex5() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        DataContainer[] data3 = {dataContainer, dataContainer2, dataContainer2};
        DataContainer<DataContainer> dataContainer3 = new DataContainer<>(data3);
        Assertions.assertTrue(dataContainer3.delete(2));
    }

    @Test
    public void deleteIndex6() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        DataContainer[] data3 = {dataContainer, dataContainer2, dataContainer2};
        DataContainer<DataContainer> dataContainer3 = new DataContainer<>(data3);
        Assertions.assertFalse(dataContainer3.delete(12));
    }

    @Test
    public void deleteItem() {
        Integer [] data = {1, 5, 9, 10, 11};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertFalse(dataContainer.delete(null));
    }

    @Test
    public void deleteItem2() {
        Integer [] data = {1, 5, 9, 10, 11};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertTrue(dataContainer.delete((Integer)5));
    }

    @Test
    public void deleteItem3() {
        Integer [] data = {1, 5, 9, 10, 11};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertFalse(dataContainer.delete(100));
    }

    @Test
    public void deleteItem4() {
        Integer [] data = {1, 5, 9, null, 10, 11};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertFalse(dataContainer.delete(null));
    }

    @Test
    public void deleteItem5() {
        Integer [] data = {1, 5, 9, null, 10, 11};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertTrue(dataContainer.delete((Integer)5));
    }

    @Test
    public void deleteItem6() {
        Integer [] data = {1, 5, 9, null, 10, 11};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        Assertions.assertFalse(dataContainer.delete(100));
    }

    @Test
    public void deleteItem7() {
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Assertions.assertFalse(dataContainer2.delete(null));
    }

    @Test
    public void deleteItem8() {
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Assertions.assertFalse(dataContainer2.delete("you"));
    }

    @Test
    public void deleteItem9() {
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Assertions.assertTrue(dataContainer2.delete("Hello"));
    }

    @Test
    public void deleteItem10() {
        String [] data2 = {};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Assertions.assertFalse(dataContainer2.delete("Hello"));
    }

    @Test
    public void deleteItem11() {
        String [] data2 = {"Hello", null};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Assertions.assertFalse(dataContainer2.delete(null));
    }

    @Test
    public void deleteItem12() {
        String [] data2 = {"Hello", null};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Assertions.assertFalse(dataContainer2.delete("you"));
    }

    @Test
    public void deleteItem13() {
        String [] data2 = {"Hello", null};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Assertions.assertTrue(dataContainer2.delete("Hello"));
    }

    @Test
    public void deleteItem14() {
        String [] data2 = {null};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Assertions.assertFalse(dataContainer2.delete("Hello"));
    }

    @Test
    public void deleteItem15() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        String [] data3 = {};
        DataContainer<String> dataContainer3 = new DataContainer<>(data3);
        DataContainer[] data4 = {dataContainer, dataContainer2, dataContainer3};
        DataContainer<DataContainer> dataContainer4 = new DataContainer<>(data4);
        Assertions.assertTrue(dataContainer4.delete(dataContainer2));
    }

    @Test
    public void deleteItem16() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        String [] data3 = {};
        DataContainer<String> dataContainer3 = new DataContainer<>(data3);
        DataContainer[] data4 = {dataContainer, dataContainer3};
        DataContainer<DataContainer> dataContainer4 = new DataContainer<>(data4);
        Assertions.assertFalse(dataContainer4.delete(dataContainer2));
    }

    @Test
    public void deleteItem17() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        String [] data3 = {};
        DataContainer<String> dataContainer3 = new DataContainer<>(data3);
        DataContainer[] data4 = {dataContainer, dataContainer3};
        DataContainer<DataContainer> dataContainer4 = new DataContainer<>(data4);
        Assertions.assertFalse(dataContainer4.delete(null));
    }

    @Test
    public void sortComparator() {
        Integer[]data = {3, 1, -3, 777, 0, 16};
        DataContainer<Integer>dataContainer = new DataContainer<>(data);
        Comparator<Integer> integerComparator = new IntegersComparator();
        dataContainer.sort(integerComparator);
        Integer[]dataExpected = {-3, 0, 1, 3, 16, 777};
        Assertions.assertArrayEquals(dataExpected, dataContainer.getItems());
    }

    @Test
    public void sortComparator2() {
        String[]data = {"i", "hello", "1", "Как домашка"};
        DataContainer<String>dataContainer = new DataContainer<>(data);
        Comparator<String>stringComparator = new StringsComparator();
        dataContainer.sort(stringComparator);
        String[]dataExpected = {"i", "1", "hello", "Как домашка"};
        Assertions.assertArrayEquals(dataExpected, dataContainer.getItems());
    }

    @Test
    public void sortComparator3() {
        String[]data = {"i", "hello", "1", "Как домашка", "oops"};
        DataContainer<String>dataContainer = new DataContainer<>(data);
        Integer [] data2 = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer2 = new DataContainer<>(data2);
        String [] data3 = {"Hello"};
        DataContainer<String> dataContainer3 = new DataContainer<>(data3);
        String [] data4 = {};
        DataContainer<String> dataContainer4 = new DataContainer<>(data4);
        DataContainer[] data5 = {dataContainer4, dataContainer, dataContainer3, dataContainer2};
        DataContainer<DataContainer> dataContainer5 = new DataContainer<>(data5);
        Comparator<DataContainer> cmp = new DataContainersComparator();
        dataContainer5.sort(cmp);
        DataContainer[] dataExpected = {dataContainer4, dataContainer3, dataContainer2, dataContainer};
        Assertions.assertArrayEquals(dataExpected, dataContainer5.getItems());
    }

    @Test
    public void toStringDC() {
        String[]data = {"i", "hello", "1", "Как домашка", "oops"};
        DataContainer<String>dataContainer = new DataContainer<>(data);
        String result = "[i, hello, 1, Как домашка, oops]";
        Assertions.assertEquals(result, dataContainer.toString());
    }

    @Test
    public void toStringDC2() {
        String[]data = {"i", "hello", null, "Как домашка", "oops"};
        DataContainer<String>dataContainer = new DataContainer<>(data);
        String result = "[i, hello, Как домашка, oops]";
        Assertions.assertEquals(result, dataContainer.toString());
    }

    @Test
    public void toStringDC3() {
        String[]data = {null};
        DataContainer<String>dataContainer = new DataContainer<>(data);
        String result = "[]";
        Assertions.assertEquals(result, dataContainer.toString());
    }

    @Test
    public void toStringDC4() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String result = "[1, 5, 9, 8]";
        Assertions.assertEquals(result, dataContainer.toString());
    }

    @Test
    public void toStringDC5() {
        Integer [] data = {1, null, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String result = "[1, 5, 9, 8]";
        Assertions.assertEquals(result, dataContainer.toString());
    }

    @Test
    public void toStringDC6() {
        Integer [] data = {null};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String result = "[]";
        Assertions.assertEquals(result, dataContainer.toString());
    }

    @Test
    public void sortStaticComparator() {
        Comparator<Integer>cmp = new IntegersComparator();
        Integer[]data = {-10, 3, 1, -3, 777, 0, 16};
        DataContainer<Integer>dataContainer = new DataContainer<>(data);
        DataContainer.sort(dataContainer, cmp);
        Integer[]dataExpected = {-10, -3, 0, 1, 3, 16, 777};
        Assertions.assertArrayEquals(dataExpected, dataContainer.getItems());
    }

    @Test
    public void sortStaticComparator2() {
        Comparator<String>cmp = new StringsComparator();
        String[]data = {"i", "hello", "like", "home", ""};
        DataContainer<String>dataContainer = new DataContainer<>(data);
        DataContainer.sort(dataContainer, cmp);
        String[]dataExpected = {"", "i", "like", "home", "hello"};
        Assertions.assertArrayEquals(dataExpected, dataContainer.getItems());
    }

    @Test
    public void sortStaticComparator3() {
        String[]data = {"i", "hello", "1", "Как домашка", "oops"};
        DataContainer<String>dataContainer = new DataContainer<>(data);
        Integer [] data2 = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer2 = new DataContainer<>(data2);
        String [] data3 = {"Hello"};
        DataContainer<String> dataContainer3 = new DataContainer<>(data3);
        String [] data4 = {};
        DataContainer<String> dataContainer4 = new DataContainer<>(data4);
        DataContainer[] data5 = {dataContainer4, dataContainer, dataContainer3, dataContainer2};
        DataContainer<DataContainer> dataContainer5 = new DataContainer<>(data5);
        Comparator<DataContainer> cmp = new DataContainersComparator();
        DataContainer.sort(dataContainer5, cmp);
        DataContainer[] dataExpected = {dataContainer4, dataContainer3, dataContainer2, dataContainer};
        Assertions.assertArrayEquals(dataExpected, dataContainer5.getItems());
    }












}
