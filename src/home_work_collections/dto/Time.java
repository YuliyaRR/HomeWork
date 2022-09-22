package home_work_collections.dto;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String descriptionOperation;
    private long durationOperation;
    private List<Time> list;

    public Time() {
        list = new ArrayList<>();
    }

    public Time(String descriptionOperation) {
        this.descriptionOperation = descriptionOperation;
    }

    public void setDescriptionOperation(String description) {
        this.descriptionOperation = description;
    }

    public void addToList(Time time) {
        list.add(time);
    }

    public List<Time> getListTime(){
        return list;
    }

    public void determineDuration (long start, long finish) {
        durationOperation = finish - start;
    }

    @Override
    public String toString() {
        return "Операция " + descriptionOperation + " заняла " + durationOperation + "мс";
    }
}
