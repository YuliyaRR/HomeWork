package home_work_war_and_peace.workers;

import java.util.Map;

public class Printer {

    public void printAllBooks(Map<Integer,String> books){
        for (Map.Entry<Integer, String> entry : books.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }
}
