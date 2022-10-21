package home_work_war_and_peace.workers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class ReaderFromFileTest {
    @Test
    public void readFile() {
        File file = new File("C:\\Users\\Romashki\\IdeaProjects\\JD1\\HomeWork\\forTestRead.txt");
        ReaderFromFile readerFromFile = new ReaderFromFile();
        String result = readerFromFile.readBookFile(file);
        String expected = "if you are reading this message then everything is working fine";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void readFile2() {
        String path = "C:\\Users\\Romashki\\IdeaProjects\\JD1\\HomeWork\\forTestRead.txt";
        ReaderFromFile readerFromFile = new ReaderFromFile();
        String result = readerFromFile.readBookFile(path);
        String expected = "if you are reading this message then everything is working fine";
        Assertions.assertEquals(expected, result);
    }
}
