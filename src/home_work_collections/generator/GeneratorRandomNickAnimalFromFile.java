package home_work_collections.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GeneratorRandomNickAnimalFromFile implements IStringGenerator {
    private File fileNick = new File("HomeWork/NickAnimal.txt");
    private List<String> nickAnimal;
    private int rndPos;

    public GeneratorRandomNickAnimalFromFile() {
        fromFileToList();
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        int listSize = this.nickAnimal.size();
        this.rndPos = rnd.nextInt(listSize);
    }

   private void fromFileToList () {
        nickAnimal = new ArrayList<>();
       try {
           Scanner scanner = new Scanner(fileNick);
           while (scanner.hasNextLine()) {
               String nick = scanner.nextLine();
               this.nickAnimal.add(nick);
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
   }

    @Override
    public String generateString() {
        return nickAnimal.get(rndPos);
    }
}
