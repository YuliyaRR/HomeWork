package home_work_war_and_peace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegExSearchTest {
    @Test
    public void search() {
        String str = "Осень пришла. Здравствуй, осень. Осень ушла. Прощай, осень.";
        String word = "осень";
        ISearchEngine searchEngine = new RegExSearch();
        Assertions.assertEquals(2, searchEngine.search(str, word));
    }

    @Test
    public void search2() {
        String str = "осеньзима осень,осень. Осень . летоосень -осень.";
        String word = "осень";
        ISearchEngine searchEngine = new RegExSearch();
        Assertions.assertEquals(3, searchEngine.search(str, word));
    }

    @Test
    public void search3() {
        String str = "Осень пришла, и Здравствуй, осень, и осень ушла, и Прощай, осень";
        String word = "и";
        ISearchEngine searchEngine = new RegExSearch();
        Assertions.assertEquals(3, searchEngine.search(str, word));
    }

    /*@Test //failed
    public void search4() {
        String str = "засветло-привет привет";
        String word = "привет";
        ISearchEngine searchEngine = new RegExSearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }*/

    @Test
    public void search5() {
        String str = "приветпривет привет";
        String word = "привет";
        ISearchEngine searchEngine = new RegExSearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }

    @Test
    public void search6() {
        String str = "привет, как дела!";
        String word = "привет";
        ISearchEngine searchEngine = new RegExSearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }

    @Test
    public void search7() {
        String str = "привет,как дела!";
        String word = "привет";
        ISearchEngine searchEngine = new RegExSearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }

    @Test
    public void search8() {
        String str = "привет;какдела!";
        String word = "привет";
        ISearchEngine searchEngine = new RegExSearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }

    /*@Test//failed
    public void search9() {
        String str = "привет-привет";
        String word = "привет";
        ISearchEngine searchEngine = new RegExSearch();
        Assertions.assertEquals(0, searchEngine.search(str, word));
    }*/

    @Test
    public void search10() {
        String str = "Привет -привет";
        String word = "привет";
        ISearchEngine searchEngine = new RegExSearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }

    @Test
    public void search11() {
        String str = "привет -привет";
        String word = "привет";
        ISearchEngine searchEngine = new RegExSearch();
        Assertions.assertEquals(2, searchEngine.search(str, word));
    }

    @Test
    public void search12() {
        String str = "бабушка бабушке бабушку";
        String word = "бабушка";
        ISearchEngine searchEngine = new RegExSearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }


}
