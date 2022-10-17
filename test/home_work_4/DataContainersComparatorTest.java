package home_work_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class DataContainersComparatorTest {
    @Test
    public void compare() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Comparator<DataContainer> cmp = new DataContainersComparator();
        int compare = cmp.compare(dataContainer, dataContainer2);
        Assertions.assertTrue(compare > 0);
    }

    @Test
    public void compare2() {
        Integer [] data = {1, 5, 9, 8};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Comparator<DataContainer> cmp = new DataContainersComparator();
        int compare = cmp.compare(dataContainer2, dataContainer);
        Assertions.assertTrue(compare < 0);
    }

    @Test
    public void compare3() {
        Integer [] data = {1};
        DataContainer<Integer> dataContainer = new DataContainer<>(data);
        String [] data2 = {"Hello"};
        DataContainer<String> dataContainer2 = new DataContainer<>(data2);
        Comparator<DataContainer> cmp = new DataContainersComparator();
        int compare = cmp.compare(dataContainer2, dataContainer);
        Assertions.assertEquals(0, compare);
    }
}
