package home_work_collections.generator;

import java.util.Random;

public class GeneratorRandomAgeAnimals implements INumGenerator {
    @Override
    public int generateNum() {
        Random rnd = new Random();
        return rnd.nextInt(15) + 1;
    }
}
