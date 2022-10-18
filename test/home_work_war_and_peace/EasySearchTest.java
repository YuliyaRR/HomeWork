package home_work_war_and_peace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EasySearchTest {
    @Test
    public void search() {
        String str = "Осень пришла. Здравствуй, осень. Осень ушла. Прощай, осень.";
        String word = "осень";
        ISearchEngine easySearch = new EasySearch();
        Assertions.assertEquals(2, easySearch.search(str, word));
    }

    @Test
    public void search2() {
        String str = "Осень пришла. осень,осень. Осень ушла. Прощай, -осень.";
        String word = "осень";
        ISearchEngine easySearch = new EasySearch();
        Assertions.assertEquals(3, easySearch.search(str, word));
    }

    @Test
    public void search3() {
        String str = "Осень пришла, и Здравствуй, осень, и осень ушла, и Прощай, осень.";
        String word = "и";
        ISearchEngine easySearch = new EasySearch();
        Assertions.assertEquals(3, easySearch.search(str, word));
    }

    @Test
    public void search4() {
        String str = "привет-привет, привет, привет -привет,приветпривет привет-";
        String word = "привет";
        ISearchEngine easySearch = new EasySearch();
        Assertions.assertEquals(4, easySearch.search(str, word));
    }

    @Test
    public void search5() {
        String str = "привет-привет 3-ий, привет, привет -привет,приветпривет 3-ий привет-";
        String word = "3-ий";
        ISearchEngine easySearch = new EasySearch();
        Assertions.assertEquals(2, easySearch.search(str, word));
    }
}
