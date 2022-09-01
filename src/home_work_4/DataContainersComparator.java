package home_work_4;

import java.util.Comparator;

public class DataContainersComparator implements Comparator<DataContainer> {
    /**
     * Метод реализует метод compare из интерфейса Comparator.
     * Объекты DataContainer сравниваются между собой по длинне внутреннего массива.
     * @param o1 - первый объект типа DataContainer
     * @param o2 - второй объект типа DataContainer
     * @return - 0, если o1 = o2;
     *         - отрицательное число, если o1 < o2;
     *         - положительное число, если о1 > o2
     */

    @Override
    public int compare(DataContainer o1, DataContainer o2) {
        return o1.getItems().length-o2.getItems().length;
    }
}
