package home_work_war_and_peace.workers;

import home_work_war_and_peace.comparator.ComparatorWordCount;
import home_work_war_and_peace.dto.WordCount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SorterTest {
    @Test
    public void sortWordCount() {
        List<WordCount> list = new ArrayList<>();
        list.add(new WordCount("осень", 5));
        list.add(new WordCount("лето", 2));
        list.add(new WordCount("весна", 10));
        list.add(new WordCount("зима", 1));
        Sorter sorter = new Sorter();
        List<WordCount> listExpected = new ArrayList<>();
        listExpected.add(new WordCount("весна", 10));
        listExpected.add(new WordCount("осень", 5));
        listExpected.add(new WordCount("лето", 2));
        listExpected.add(new WordCount("зима", 1));
        Comparator<WordCount>cmp = new ComparatorWordCount();
        sorter.sortWordCount(list, cmp);
        Assertions.assertEquals(listExpected, list);
    }
}
