package home_work_collections.worker;

import home_work_collections.dto.Time;

import java.util.Collection;
import java.util.Iterator;

public class RemoverWithTime {
    public <T> void deleteIterator(Collection<T> collection, Time t) {
        Time time = new Time("удаление с помощью iterator");
        long start = System.currentTimeMillis();

        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);
    }

    public <T> void deleteJDK(Collection<T> collection, Time t) {
        Time time = new Time("удаление с помощью метода clear() интерфейса Collection");
        long start = System.currentTimeMillis();

        collection.clear();

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);
    }
}
