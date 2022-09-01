package home_work_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer <T> implements Comparable <DataContainer<T>>, Iterable<T>{

    private T[] data;

    public DataContainer(T[] data) {

        this.data = data;
    }

    /**
     * Метод добавляет данные во внутреннее поле data и возвращает номер позиции, в которую были вставлены данные, начиная с 0.
     * @param item - элемент, который необходимо добавить во внутренний массив
     * @return - индекс позиции, в которую вставлен элемент.
     *         -1 - индикатором того, что данный элемент в контейнер вставлять нельзя (null).
     */
    public int add(T item) {
        int indexAdd = 0;

        if (item == null) { //если элемент null, то возврат -1
            return -1;
        }

        if(data.length == 0) { // если массив нулевой длины - создаем новый массив
            data = makeNewLongArray(data);
        }

        boolean needMakeNewArr = true;//флаг - нужно ли создавать новый массив, по умолчанию - Да
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                indexAdd = i;
                needMakeNewArr = false;// создавать новый массив не нужно, элемент добавлен в текущий массив
                break;
            }
        }
        if (needMakeNewArr) { // если добавлений в массив не было (флаг true не изменен)
            data = makeNewLongArray(data);
            data[data.length - 1] = item;
            indexAdd = data.length - 1;
        }
        return indexAdd;
    }

    /**
     * Метод возвращает объект по индексу хранения
     * @param index - индекс позиции элемента в массиве
     * @return - объект по индексу хранения либо null, если такого индекса нет во внутреннем массиве
     */
    public T get (int index) {
        if (index < data.length) {
            return data[index];
        } else {
            return null;
        }
    }

    /**
     * Метод возвращает внутренний массив из объекта DataContainer
     * @return - внутренний массив
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Метод удаляет элемент из внутреннего массива по переданному индексу.
     * При успешном удалении освободившаяся ячейка полностью удаляется.
     * @param index - позиция элемента, который нужно удалить
     * @return - true - элемент удален успешно,
     *         - false - переданный индекс выходит за границы массива.
     */
    public boolean delete(int index) {
        boolean makeDelete = true; //флаг - по умолчанию удаление получилось сделать

        if (index < data.length) {
            data[index] = null;
            data = makeNewShortArray(data,index);
        } else {
            makeDelete = false;
        }
        return makeDelete;
    }

    /**
     * Метод удаляет переданный элемент из внутреннего массива, если так такой имеется.
     * При успешном удалении освободившаяся ячейка полностью удаляется.
     * @param item - элемент, который нужно удалить
     * @return - true - элемент удален успешно,
     *         - false - передан null или массив не содержит переданный элемент .
     */
    public boolean delete(T item) {
        boolean makeDelete = true; //флаг - по умолчанию удаление получилось сделать

        if (item == null || data.length == 0) {
            return false;
        }

        for (int i = 0; i < data.length; i++) {
            if(item.equals(data[i])) {
                makeDelete = true;
                data[i] = null;
                data = makeNewShortArray(data,i);
                break;
            } else {
                makeDelete = false;
            }
        }
        return makeDelete;
    }

    /**
     * Метод занимается сортировкой данных, записанных в поле data,
     * используя реализацию сравнения из переданного объекта comparator.
     * @param comparator - объект Comparator, используемый для сравнения данных
     */
    public void sort (Comparator<T> comparator){
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 0; j < data.length-1-i; j++) {
                if(comparator.compare(data[j],data[j+1]) > 0) {
                    T temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    /**
     * Метод сортирует элементы в переданном объекте DataContainer, используя реализацию сравнения,
     * вызываемую у хранимых объектов.
     * @param container - объекте DataContainer
     * @param <T> - дженерик-метод
     */
    public static <T> void sort (DataContainer<? extends Comparable> container){
        Comparable[] arr = container.getItems();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0) {
                    Comparable temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     *Метод сортирует элементы в переданном объекте DataContainer, используя реализацию сравнения
     * из переданного объекта интерфейса Comparator.
     * @param container - объект DataContainer
     * @param comparator - реализация интерфейса Comparator
     * @param <T> - дженерик-метод
     */
    public static <T> void sort (DataContainer<T>container, Comparator<T>comparator) {
        container.sort(comparator); // Короткий вариант

        //Длинный вариант
        /*T[]item = container.getItems();
        for (int i = 0; i < item.length-1; i++) {
            for (int j = 0; j < item.length-1-i; j++) {
                if(comparator.compare(item[j],item[j+1]) > 0) {
                    T temp = item[j];
                    item[j] = item[j+1];
                    item[j+1] = temp;
                }
            }
        }*/
        //Оба делают одно и тоже.
        // Если в коде присутствует метод public void sort (Comparator<T> comparator),
        // нерационально использовать длинный вариант.
    }

    /**
     * Метод создает новый массив большей длинны (+1 ячейка) на основе переданного массива
     * @param data - массив - основа для нового массива
     * @return - новый массив большей длинны
     */
    public T[] makeNewLongArray(T[] data){

        return Arrays.copyOf(data, data.length + 1);
    }

    /**
     * Метод создает новый массив меньшей длинны (-1 ячейка) на основе переданного массива,
     * сдвигая ячейки влево, начиная с ячейки под переданным индексом.
     * @param data - массив - основа для нового массива
     * @param index - индекс ячейки, с которой начинается сдвиг всех последующих элементов влево
     * @return - новый массив меньшей длинны
     */
    public T[] makeNewShortArray (T[]data, int index) {
        for (int i = index; i < data.length-1; i++) {
            data[i] = data[i + 1];
        }
        return Arrays.copyOf(data, data.length-1);
    }

    /**
     * Метод реализует метод compareTo интерфейса Comparable для объектов типа DataContainer.
     * Объекты DataContainer сравниваются между собой по длинне внутреннего массива.
     * @param container - объект DataContainer, с которым нужно сравнить объект DataContainer, вызвавший метод
     * @return - 0 - если объекты равны;
     *         - отрицательное число, если переданный объект больше объекта, вызвавшего метод;
     *         - положительное число, если объект, вызвавший метод, больше переданного объекта.
     */
    @Override
    public int compareTo(DataContainer<T> container) {
        return data.length - container.data.length;
    }

    /**
     * Метод реализует метод iterator() интерфейса Iterable для объектов типа DataContainer.
     * Внутри метода создается объект Iterator и во вложенном анонимном классе реализуются методы интерфейса Iterator.
     * @return - Iterator, позволяющий использовать цикл for-each для объектов типа DataContainer.
     */
    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator <>() {

            private  int i = 0;

            /**
             * Метод проверяет, есть ли дальше еще элементы для возврата
             * @return - true, если элементы еще есть
             *         - false, если все элементы пройдены или элемент равен null
             */
            @Override
            public boolean hasNext() {
                if (i < data.length && data[i] != null) {
                    return true;
                } else {
                    return false;
                }
            }

            /**
             *Метод возвращает следующий элемент итерации.
             * @return - следующий элемент итерации.
             */
            @Override
            public T next() {
                return data[i++];
            }
        };

        return iterator;
    }

    /**
     * Переопределен метод toString():
     * метод выводит содержимое внутреннего массива в [] и без ячеек, в которых хранится null.
     * @return - содержимое внутреннего массива в [].
     */
    @Override
    public String toString() {
        if(data.length == 0) {
            return "[]";
        }
        StringBuilder stb = new StringBuilder();
        stb.append("[");
        boolean delimiter = false; //флаг - по умолчанию разделитель не нужен
        for (T datum : data) {
            if(datum != null) {
                if(delimiter) {
                    stb.append(", ").append(datum);

                } else {
                    delimiter = true;
                    stb.append(datum);
                }
            }
        }
        stb.append("]");
        return stb.toString();
    }



}
