package home_work_war_and_peace.comparator;

import home_work_war_and_peace.dto.WordCount;

import java.util.Comparator;

public class ComparatorWordCount implements Comparator<WordCount> {
    @Override
    public int compare(WordCount o1, WordCount o2) {
        Integer count1 = o1.getCount();
        Integer count2 = o2.getCount();
        return count2 - count1;
    }
}
