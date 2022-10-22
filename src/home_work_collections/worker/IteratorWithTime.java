package home_work_collections.worker;

import home_work_collections.dto.Time;

import java.util.Collection;
import java.util.Iterator;

public class IteratorWithTime {

    public <T> void iterationIterator (Collection<T> collection, Time t) {
        Time time = new Time("итерирование с помощью iterator");
        long start = System.currentTimeMillis();

        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);

    }

    public <T> void iterationForEach (Collection <T> collection, Time t) {
        Time time = new Time("итерирование с помощью forEach");
        long start = System.currentTimeMillis();

        collection.forEach(System.out::println);

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);
    }
}
