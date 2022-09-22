package home_work_collections.comparator;

import home_work_collections.dto.Person;

import java.util.Comparator;

public class LengthPasswordComparator implements Comparator <Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getPassword().length() - p2.getPassword().length();
    }
}
