package home_work_war_and_peace.workers;

import home_work_war_and_peace.dto.WordCount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.*;

public class FillerTest {
    @Test
    public void fillSet() {
        Filler filler = new Filler();
        String[]arr = {"Все", "здесь", "здесь", "ок"};
        int sizeExpected = 3;
        Assertions.assertEquals(sizeExpected, filler.fillSetWithWords(arr).size());
    }

    @Test
    public void fillSet2() {
        Filler filler = new Filler();
        String[]arr = {"Все", "здесь", "здесь", "ок"};
        Assertions.assertTrue(filler.fillSetWithWords(arr).contains("Все"));
    }

    @Test
    public void fillMap() {
        Filler filler = new Filler();
        String[]arr = {"Все", "здесь", "здесь", "ок"};
        int sizeExpected = 3;
        Assertions.assertEquals(sizeExpected, filler.fillMapWithWords(arr).size());
    }

    @Test
    public void fillMap2() {
        Filler filler = new Filler();
        String[]arr = {"Все", "здесь", "здесь", "ок"};
        Assertions.assertTrue(filler.fillMapWithWords(arr).containsKey("Все"));
    }
    @Test
    public void fillMap3() {
        Filler filler = new Filler();
        String[]arr = {"Все", "здесь", "здесь", "ок"};
        int countExpected = 1;
        Assertions.assertEquals(countExpected,filler.fillMapWithWords(arr).get("Все"));
    }

    @Test
    public void fillMap4() {
        Filler filler = new Filler();
        String[]arr = {"Все", "здесь", "здесь", "ок"};
        int countExpected = 2;
        Assertions.assertEquals(countExpected,filler.fillMapWithWords(arr).get("здесь"));
    }

    @Test
    public void fillList() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        Filler filler = new Filler();
        int sizeExpected = 3;
        Assertions.assertEquals(sizeExpected, filler.fillListWithWords(map).size());
    }

    @Test
    public void fillList2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        Filler filler = new Filler();
        Assertions.assertTrue(filler.fillListWithWords(map).contains(new WordCount("two", 2)));
    }

    @Test
    public void fillTopWordToList() {
        List<WordCount> list = new ArrayList<>();
        list.add(new WordCount("весна", 10));
        list.add(new WordCount("осень", 5));
        list.add(new WordCount("лето", 2));
        list.add(new WordCount("зима", 1));
        Filler filler = new Filler();
        List<WordCount> expected = new ArrayList<>();
        expected.add(new WordCount("весна", 10));
        expected.add(new WordCount("осень", 5));
        Assertions.assertEquals(expected, filler.fillTopWordToList(list, 2));
    }

    @Test
    public void fillMapWithBooksName() {
        String path = "C:\\Users\\Romashki\\IdeaProjects\\JD1\\HomeWork\\eBooks";
        File file = new File(path);
        Filler filler = new Filler();
        Map<Integer,String> books = filler.fillMapWithBooksName(file);
        Assertions.assertTrue(books.containsValue("Adams_Avtostopom-po-Galaktike" +
                "-Restoran-U-konca-Vselennoy-.155848.fb2.txt"));
    }

    @Test
    public void fillMapWithBooksFile() {
        String path = "C:\\Users\\Romashki\\IdeaProjects\\JD1\\HomeWork\\eBooks";
        File file = new File(path);
        File exp = new File("C:\\Users\\Romashki\\IdeaProjects\\JD1\\HomeWork\\eBooks\\Keruak_V-doroge.443229.fb2.txt");
        Filler filler = new Filler();
        Map<Integer,File> books = filler.fillMapWithBooksFile(file);
        Assertions.assertTrue(books.containsValue(exp));
    }

    @Test
    public void fillSetLibrary() {
        String path = "C:\\Users\\Romashki\\IdeaProjects\\JD1\\HomeWork\\eBooks";
        File file = new File(path);
        Filler filler = new Filler();
        Set<File> library = filler.fillSetLibrary(file);
        File exp = new File("C:\\Users\\Romashki\\IdeaProjects\\JD1\\HomeWork\\eBooks\\Keruak_V-doroge.443229.fb2.txt");
        Assertions.assertTrue(library.contains(exp));
    }
}
