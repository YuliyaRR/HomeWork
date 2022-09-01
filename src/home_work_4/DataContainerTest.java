package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerTest {
    public static void main(String[] args) {
        Integer [] data = {1, 5, 9, null};
        String [] data1 = {};

        //Тесты метода add
        System.out.println("****Тесты метода add(T item)****");
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        System.out.println("Массив до добавления " + Arrays.toString(dataContainer.getItems()));
        int index = dataContainer.add(8);// 3 - [1,5,9,8]
        System.out.println("Элемент добавлен в массив по индексу " + index);
        System.out.println("Массив после добавления " + Arrays.toString(dataContainer.getItems()));
        int index1 = dataContainer.add(8);// 4 - [1,5,9,8,8]
        System.out.println("Массив переполнен. Элемент добавлен в массив по индексу " + index1);
        System.out.println("Массив после добавления " + Arrays.toString(dataContainer.getItems()));
        System.out.println();

        DataContainer<String> dataContainer1 = new DataContainer<>(data1);
        System.out.println("Массив до добавления " + Arrays.toString(dataContainer1.getItems()));
        int index2 = dataContainer1.add("Hello"); // 0 - [Hello]
        System.out.println("Массив расширен. Элемент добавлен по индексу " + index2);
        System.out.println("Массив после добавления " + Arrays.toString(dataContainer1.getItems()));
        int index3 = dataContainer1.add(null); // -1
        System.out.println("Попытка добавить null в массив. Результат: " + index3);
        System.out.println("Массив после добавления " + Arrays.toString(dataContainer1.getItems()));
        System.out.println();

        DataContainer[] data2 = {dataContainer, null, dataContainer1, null};
        DataContainer<DataContainer> dataContainer2 = new DataContainer<>(data2);
        System.out.println("Массив до добавления " + Arrays.toString(dataContainer2.getItems()));
        int index4 = dataContainer2.add(dataContainer1);//1 - [[1, 5, 9, 8, 8], [Hello], [Hello]]
        System.out.println("Элемент добавлен в массив по индексу " + index4);
        System.out.println("Массив после добавления " + Arrays.toString(dataContainer2.getItems()));
        System.out.println();

        //Тесты метода T get (int index)
        System.out.println("****Тесты метода T get (int index)****");
        System.out.println("Извлекаем данные из объекта dataContainer " +Arrays.toString(dataContainer.getItems()));
        Integer fromData = dataContainer.get(4);//8
        System.out.println("По индексу 4 хранится " + fromData);
        Integer fromData1 = dataContainer.get(5);//null
        System.out.println("По индексу 5 хранится " + fromData1 + ". Индекс выходит за границы массива.");
        System.out.println();

        System.out.println("Извлекаем данные из объекта dataContainer1 " +Arrays.toString(dataContainer1.getItems()));
        String fromData2 = dataContainer1.get(0);//Hello
        System.out.println("По индексу 0 хранится " + fromData2);
        String fromData3 = dataContainer1.get(1);//null
        System.out.println("По индексу 1 хранится " + fromData3 + ". Индекс выходит за границы массива.");
        System.out.println();

        System.out.println("Извлекаем данные из объекта dataContainer2 " +Arrays.toString(dataContainer2.getItems()));
        DataContainer fromData4 = dataContainer2.get(2);//[Hello]
        System.out.println("По индексу 2 хранится " + fromData4);
        DataContainer fromData5 = dataContainer2.get(3);//null
        System.out.println("По индексу 3 хранится " + fromData5 + ". Индекс выходит за границы массива.");
        System.out.println();

        //Тесты метода getItems()
        System.out.println("****Тесты метода T[] getItems()****");
        Integer[] fromDC = dataContainer.getItems();//[1, 5, 9, 8, 8]
        System.out.println("Извлекаем внутренний массив из объекта dataContainer: " + Arrays.toString(fromDC));
        String[] fromDC1 = dataContainer1.getItems();//[Hello]
        System.out.println("Извлекаем внутренний массив из объекта dataContainer1: " + Arrays.toString(fromDC1));
        DataContainer[] fromDC2 = dataContainer2.getItems();
        System.out.println("Извлекаем внутренний массив из объекта dataContainer2: " + Arrays.toString(fromDC2));
        System.out.println();

        //Тест метода boolean delete(int index)
        System.out.println("****Тесты метода boolean delete(int index)****");
        System.out.println("Массив до удаления " + Arrays.toString(dataContainer.getItems()));// [1, 5, 9, 8, 8]
        boolean isDelete = dataContainer.delete(5);//false
        System.out.println("Удаление элемента по индексу 5. Результат " + isDelete);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer.getItems()));
        boolean isDelete1 = dataContainer.delete(4);//true
        System.out.println("Удаление элемента по индексу 4. Результат " + isDelete1);
        System.out.println("Массив после удаления " + Arrays.toString(dataContainer.getItems()));//[1, 5, 9, 8]
        System.out.println();

        System.out.println("Массив до удаления " + Arrays.toString(dataContainer2.getItems()));//[[1, 5, 9, 8, 8], [Hello], [Hello], null]
        boolean isDelete2 = dataContainer2.delete(2);//true
        System.out.println("Удаление элемента по индексу 2. Результат " + isDelete2);
        System.out.println("Массив после удаления " + Arrays.toString(dataContainer2.getItems()));//[[1, 5, 9, 8], [Hello], null]
        boolean isDelete3 = dataContainer2.delete(5);//false
        System.out.println("Удаление элемента по индексу 5. Результат " + isDelete3);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer2.getItems()));//[[1, 5, 9, 8], [Hello], null]
        System.out.println();

        System.out.println("Массив до удаления " + Arrays.toString(dataContainer1.getItems()));//[Hello]
        boolean isDelete4 = dataContainer1.delete(0);//true
        System.out.println("Удаление элемента по индексу 0. Результат " + isDelete4);
        System.out.println("Массив после удаления " + Arrays.toString(dataContainer1.getItems()));//[]
        boolean isDelete5 = dataContainer1.delete(2);//false
        System.out.println("Удаление элемента по индексу 2. Результат " + isDelete5);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer1.getItems()));
        System.out.println();

        //Тесты метода boolean delete(T item)
        System.out.println("****Тесты метода boolean delete(T item)****");
        Integer [] data3 = {1, 5, 9, null, 10,11};
        DataContainer<Integer>dataContainer3 = new DataContainer<>(data3);
        System.out.println("Массив до удаления " + Arrays.toString(dataContainer3.getItems()));//[1, 5, 9, null, 10,11]
        boolean isDelete6 = dataContainer3.delete(null);//false
        System.out.println("Удаляем null. Результат " + isDelete6);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer3.getItems()));//[1, 5, 9, null, 10,11]
        boolean isDelete7 = dataContainer3.delete((Integer)5);//true
        System.out.println("Удаляем 5. Результат " + isDelete7);
        System.out.println("Массив после удаления " + Arrays.toString(dataContainer3.getItems()));//[1,9, null, 10,11]
        boolean isDelete8 = dataContainer3.delete((Integer)100);//false
        System.out.println("Удаляем 100. Результат " + isDelete8);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer3.getItems()));//[1,9, null, 10,11]
        System.out.println();

        System.out.println("Массив до удаления " + Arrays.toString(dataContainer.getItems()));// [1, 5, 9, 8]
        boolean isDelete9 = dataContainer.delete(null);//false
        System.out.println("Удаляем null. Результат " + isDelete9);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer.getItems()));//[1, 5, 9, 8,8]
        boolean isDelete10 = dataContainer.delete((Integer) 1);//true
        System.out.println("Удаляем 1. Результат " + isDelete10);
        System.out.println("Массив после удаления " + Arrays.toString(dataContainer.getItems()));//[5, 9, 8]
        boolean isDelete11 = dataContainer.delete((Integer) 100);//false
        System.out.println("Удаляем 100. Результат  " + isDelete11);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer.getItems()));//[5, 9, 8]
        System.out.println();

        String [] data4 = {"Hello"};
        DataContainer<String> dataContainer4 = new DataContainer<>(data4);
        System.out.println("Массив до удаления " + Arrays.toString(dataContainer4.getItems()));//[Hello]
        boolean isDelete12 = dataContainer4.delete(null);//false
        System.out.println("Удаляем null. Результат " + isDelete12);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer4.getItems()));//[Hello]
        boolean isDelete13 = dataContainer4.delete("You");//false
        System.out.println("Удаляем You. Результат " + isDelete13);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer4.getItems()));//[Hello]
        boolean isDelete14 = dataContainer4.delete("Hello");//true
        System.out.println("Удаляем Hello. Результат " + isDelete14);
        System.out.println("Массив после удаления " + Arrays.toString(dataContainer4.getItems()));//[]
        boolean isDelete15 = dataContainer4.delete("Oops");//false
        System.out.println("Удаляем Oops " + isDelete15);
        System.out.println("Массив после удаления " + Arrays.toString(dataContainer4.getItems()));//[]
        System.out.println();

        String[] data5 = {"Hello", null};
        DataContainer<String>dataContainer5 = new DataContainer<>(data5);
        System.out.println("Массив до удаления " + Arrays.toString(dataContainer5.getItems()));//["Hello", null]
        boolean isDelete16 = dataContainer5.delete(null);//false
        System.out.println("Удаляем null. Результат " + isDelete16);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer5.getItems()));//["Hello", null]
        boolean isDelete17 = dataContainer5.delete("You");//false
        System.out.println("Удаляем You. Результат " + isDelete17);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer5.getItems()));//["Hello", null]
        boolean isDelete18 = dataContainer5.delete("Hello");//true
        System.out.println("Удаляем Hello. Результат  " + isDelete18);
        System.out.println("Массив после удаления " + Arrays.toString(dataContainer5.getItems()));//[null]
        boolean isDelete19 = dataContainer5.delete("Hello");//false
        System.out.println("Удаляем Hello. Результат  " + isDelete19);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer5.getItems()));//[null]
        System.out.println();

        String[]data6 = {"Hello"};
        DataContainer<String>dataContainer6 = new DataContainer<>(data6);
        DataContainer[]data7 = {dataContainer, dataContainer6, dataContainer3, dataContainer4};
        DataContainer<DataContainer> dataContainer7 = new DataContainer<>(data7);
        System.out.println("Массив до удаления " + Arrays.toString(dataContainer7.getItems()));//[[5, 9, 8], [Hello], [1, 9, 10, 11], []]
        boolean isDelete20 = dataContainer7.delete(dataContainer6);//true
        System.out.println("Удаляем [Hello]. Результат  " + isDelete20);
        System.out.println("Массив после удаления " + Arrays.toString(dataContainer7.getItems()));//[[5, 9, 8], [1, 9, 10, 11], []]
        boolean isDelete21 = dataContainer7.delete(dataContainer6);//false
        System.out.println("Удаляем [Hello]. Результат  " + isDelete21);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer7.getItems()));//[[5, 9, 8], [1, 9, 10, 11], []]
        boolean isDelete22 = dataContainer7.delete(dataContainer);
        System.out.println("Удаляем [5, 9, 8]. Результат  " + isDelete22);//true
        System.out.println("Массив после удаления " + Arrays.toString(dataContainer7.getItems()));//[[1, 9, 10, 11], []]
        boolean isDelete23 = dataContainer7.delete(dataContainer);
        System.out.println("Удаляем [5, 9, 8]. Результат  " + isDelete23);//false
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer7.getItems()));//[[1, 9, 10, 11], []]
        boolean isDelete24 = dataContainer7.delete(dataContainer4);
        System.out.println("Удаляем []. Результат  " + isDelete24);//true
        System.out.println("Массив после удаления " + Arrays.toString(dataContainer7.getItems()));//[[1, 9, 10, 11]]
        boolean isDelete25 = dataContainer7.delete(null);//false
        System.out.println("Удаляем null. Результат " + isDelete25);
        System.out.println("Массив после попытки удаления " + Arrays.toString(dataContainer7.getItems()));//[[1, 9, 10, 11]]
        System.out.println();

        //Тесты метода void sort (Comparator<T> comparator)
        System.out.println("****Тесты метода void sort (Comparator<T> comparator)****");
        Integer[]data8 = {3, 1, -3, 777, 0, 16};
        DataContainer<Integer>dataContainer8 = new DataContainer<>(data8);
        Comparator<Integer> integerComparator = new IntegersComparator();
        System.out.println("Массив до сортировки " + Arrays.toString(dataContainer8.getItems()));//[3, 1, -3, 777, 0, 16]
        dataContainer8.sort(integerComparator);
        System.out.println("Массив после сортировки " + Arrays.toString(dataContainer8.getItems()));//[-3, 0, 1, 3, 16, 777]
        System.out.println();

        String[]data9 = {"i", "hello", "1", "Как домашка"};
        DataContainer<String>dataContainer9 = new DataContainer<>(data9);
        Comparator<String>stringComparator = new StringsComparator();
        System.out.println("Массив до сортировки " + Arrays.toString(dataContainer9.getItems()));//[i, hello, 1, Как домашка]
        dataContainer9.sort(stringComparator);
        System.out.println("Массив после сортировки " + Arrays.toString(dataContainer9.getItems()));//[i, 1, hello, Как домашка]
        System.out.println();

        DataContainer[] data10 = {dataContainer8, dataContainer9, dataContainer6, dataContainer4};
        DataContainer<DataContainer> dataContainer10 = new DataContainer<>(data10);
        Comparator<DataContainer>dataContainerComparator = new DataContainersComparator();
        System.out.println("Массив до сортировки " + Arrays.toString(dataContainer10.getItems()));
        //[[-3, 0, 1, 3, 16, 777], [i, 1, hello, Как домашка], [Hello], []]
        dataContainer10.sort(dataContainerComparator);
        System.out.println("Массив после сортировки " + Arrays.toString(dataContainer10.getItems()));
        //[[], [Hello], [i, 1, hello, Как домашка], [-3, 0, 1, 3, 16, 777]]
        System.out.println();

        //Тесты метода String toString()
        System.out.println("****Тесты метода String toString()****");
        System.out.println("DataContainer до переопределения toString()  " + Arrays.toString(dataContainer8.getItems()));
        System.out.println("DataContainer после переопределения toString()  "+ dataContainer8);
        System.out.println();

        System.out.println("DataContainer до переопределения toString()  " + Arrays.toString(dataContainer9.getItems()));
        System.out.println("DataContainer после переопределения toString()  "+ dataContainer9);
        System.out.println();

        System.out.println("DataContainer до переопределения toString()  " + Arrays.toString(dataContainer10.getItems()));
        System.out.println("DataContainer после переопределения toString()  "+ dataContainer10);
        System.out.println();

        Integer [] data11 = {null, 1, 5, 9, null, 10,11, null};
        DataContainer<Integer>dataContainer11 = new DataContainer<>(data11);
        System.out.println("DataContainer до переопределения toString()  " + Arrays.toString(dataContainer11.getItems()));
        System.out.println("DataContainer после переопределения toString()  "+ dataContainer11);
        System.out.println();

        System.out.println("DataContainer до переопределения toString()  " + Arrays.toString(dataContainer5.getItems()));
        System.out.println("DataContainer после переопределения toString()  "+ dataContainer5);
        System.out.println();

        System.out.println("DataContainer до переопределения toString()  " + Arrays.toString(dataContainer4.getItems()));
        System.out.println("DataContainer после переопределения toString()  "+ dataContainer4);
        System.out.println();

        //Тесты метода static <T> void sort (DataContainer<? extends Comparable> container)
        System.out.println("****Тесты метода static <T> void sort (DataContainer<? extends Comparable> container)****");
        Integer[]data12 = {3, 1, -3, 777, 0, 16};
        DataContainer<Integer>dataContainer12 = new DataContainer<>(data12);
        System.out.println("До сортировки: " + dataContainer12);
        DataContainer.sort(dataContainer12);
        System.out.println("После сортировки: " + dataContainer12);
        System.out.println();

        String[]data13 = {"i", "hello", "like", "home"};
        DataContainer<String>dataContainer13 = new DataContainer<>(data13);
        System.out.println("До сортировки: " + dataContainer13);
        DataContainer.sort(dataContainer13);
        System.out.println("После сортировки: " + dataContainer13);
        System.out.println();

        DataContainer[]data14 = {dataContainer8, dataContainer9, dataContainer6, dataContainer4};
        DataContainer<DataContainer>dataContainer14 = new DataContainer<>(data14);
        System.out.println("До сортировки: " + dataContainer14);
        DataContainer.sort(dataContainer14);
        System.out.println("После сортировки: "+dataContainer14);
        System.out.println();

        //Тесты метода static <T> void sort (DataContainer<T>container, Comparator<T>comparator)
        System.out.println("****Тесты метода static <T> sort (DataContainer<T>container, Comparator<T>comparator)****");
        Comparator<Integer>cmp = new IntegersComparator();
        Comparator<String>cmp1 = new StringsComparator();
        Comparator<DataContainer>cmp2 = new DataContainersComparator();

        Integer[]data15 = {-10, 3, 1, -3, 777, 0, 16};
        DataContainer<Integer>dataContainer15 = new DataContainer<>(data15);
        System.out.println("До сортировки: " + dataContainer15);
        DataContainer.sort(dataContainer15, cmp);
        System.out.println("После сортировки: " + dataContainer15);
        System.out.println();

        String[]data16 = {"i", "hello", "like", "home", ""};
        DataContainer<String>dataContainer16 = new DataContainer<>(data16);
        System.out.println("До сортировки: " + dataContainer16);
        DataContainer.sort(dataContainer16, cmp1);
        System.out.println("После сортировки: " + dataContainer16);
        System.out.println();

        DataContainer[]data17 = {dataContainer15, dataContainer16, dataContainer6, dataContainer4};
        DataContainer<DataContainer>dataContainer17 = new DataContainer<>(data17);
        System.out.println("До сортировки: " + dataContainer17);
        DataContainer.sort(dataContainer17, cmp2);
        System.out.println("После сортировки: "+ dataContainer17);
        System.out.println();

        //Тесты метода Iterator<T> iterator()
        System.out.println("****Тесты метода Iterator<T> iterator()****");
        System.out.println("Вывод в консоль содержимого dataContainer15 "  + dataContainer15 + " с использование цикла for-each");
        for (Integer integer : dataContainer15) {
            System.out.println(integer);
        }

        System.out.println("Вывод в консоль содержимого dataContainer16 "  + dataContainer16 + " с использование цикла for-each");
        for (String s : dataContainer16) {
            System.out.println(s);
        }

        System.out.println("Вывод в консоль содержимого dataContainer17 "  + dataContainer17 + " с использование цикла for-each");
        for (DataContainer container : dataContainer17) {
            System.out.println(container);
        }


























    }


}
