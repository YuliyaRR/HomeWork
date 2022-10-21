package home_work_war_and_peace.workers;

import home_work_war_and_peace.dto.WordCount;

import java.util.Comparator;
import java.util.List;

public class Sorter {

    public void sortWordCount(List<WordCount>list, Comparator<WordCount> cmp) {
        list.sort(cmp);
    }
}
