package home_work_collections.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorRandomName implements IStringGenerator{
    private List<String> peopleNames = new ArrayList<>();

    {
        peopleNames.add("Вася");
        peopleNames.add("Костя");
        peopleNames.add("Юра");
        peopleNames.add("Артур");
        peopleNames.add("Саша");
        peopleNames.add("Маша");
        peopleNames.add("Оля");
        peopleNames.add("Женя");
        peopleNames.add("Катя");
        peopleNames.add("Лена");
    }

    public List<String> getPeopleNames() {
        return peopleNames;
    }

    public void addName(String newName) {
        peopleNames.add(newName);
    }

    @Override
    public String generateString() {
        Random rnd = new Random();
        int sizeList = peopleNames.size();
        int indexRandom = rnd.nextInt(sizeList);
        return peopleNames.get(indexRandom);
    }
}
