package home_work_collections.generator;

import home_work_collections.api.IStringGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorRandomNickAnimal implements IStringGenerator {
    private List<String> animalsNicks = new ArrayList<>();

    {
        animalsNicks.add("Урфус");
        animalsNicks.add("Джус");
        animalsNicks.add("Жорик");
        animalsNicks.add("Плюша");
        animalsNicks.add("Люци");
        animalsNicks.add("Умка");
        animalsNicks.add("Джем");
        animalsNicks.add("Лори");
        animalsNicks.add("Анри");
        animalsNicks.add("Алексис");
        animalsNicks.add("Жоржик");
        animalsNicks.add("Коржик");
        animalsNicks.add("Пенка");
        animalsNicks.add("Пушок");
        animalsNicks.add("Лучик");
    }

    public List<String> getAnimalsNicks() {
        return animalsNicks;
    }

    public void addName(String newName) {
        animalsNicks.add(newName);
    }

    @Override
    public String generateString() {
        Random rnd = new Random();
        int sizeList = animalsNicks.size();
        int indexRandom = rnd.nextInt(sizeList);
        return animalsNicks.get(indexRandom);
    }
}
