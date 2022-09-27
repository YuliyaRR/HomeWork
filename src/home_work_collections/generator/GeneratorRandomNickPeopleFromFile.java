package home_work_collections.generator;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ThreadLocalRandom;

public class GeneratorRandomNickPeopleFromFile implements IStringGenerator {
    private File fileNick = new File("HomeWork/NickPeople.txt");
    private long rndPos;

    public GeneratorRandomNickPeopleFromFile() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        long fileLength = fileNick.length();
        this.rndPos = rnd.nextLong(fileLength);
    }

    @Override
    public String generateString() {
        String name = "";
        try {
            RandomAccessFile raf = new RandomAccessFile(fileNick, "r");
            raf.seek(this.rndPos);
            name = raf.readLine();
            name = raf.readLine();
            if (name == null) {
                raf.seek(0);
                name = raf.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return name;
    }
}
