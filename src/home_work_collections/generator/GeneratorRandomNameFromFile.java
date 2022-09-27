package home_work_collections.generator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class GeneratorRandomNameFromFile implements IStringGenerator {

    private int count;

    public GeneratorRandomNameFromFile() {
        Random rnd = new Random();
        this.count = rnd.nextInt(14) + 1;//чтобы не генерировало 0 доб.+1
    }

    @Override
    public String generateString() {
        String name = "";
        int repeat = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("HomeWork/Name.txt"))) {
            do {
                name = reader.readLine();
                repeat++;
            } while (repeat < this.count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return name;
    }
}
