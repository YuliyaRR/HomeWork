package home_work_war_and_peace.searchers;

import home_work_war_and_peace.api.ISearchEngine;
import home_work_war_and_peace.searchers.EasySearch;
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

    @Test
    public void search6() {
        String str = "привет, как дела!";
        String word = "привет";
        ISearchEngine searchEngine = new EasySearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }

    @Test
    public void search7() {
        String str = "привет,как дела!";
        String word = "привет";
        ISearchEngine searchEngine = new EasySearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }

    @Test
    public void search8() {
        String str = "привет;какдела!";
        String word = "привет";
        ISearchEngine searchEngine = new EasySearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }

    @Test
    public void search9() {
        String str = "привет-привет";
        String word = "привет";
        ISearchEngine searchEngine = new EasySearch();
        Assertions.assertEquals(0, searchEngine.search(str, word));
    }

    @Test
    public void search10() {
        String str = "Привет -привет";
        String word = "привет";
        ISearchEngine searchEngine = new EasySearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }

    @Test
    public void search11() {
        String str = "привет -привет";
        String word = "привет";
        ISearchEngine searchEngine = new EasySearch();
        Assertions.assertEquals(2, searchEngine.search(str, word));
    }

    @Test
    public void search12() {
        String str = "бабушка бабушке бабушку";
        String word = "бабушка";
        ISearchEngine searchEngine = new EasySearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }

    @Test
    public void search13() {
        String str = "Привет.привет,привет:привет привет-привет привет!на привет привет, и (привет) привет ?привет\" +\n" +
                "                \" привет      привет\\n привет. привет, привет ";
        String word = "привет";
        ISearchEngine searchEngine = new EasySearch();
        Assertions.assertEquals(14, searchEngine.search(str, word));
    }

    @Test
    public void search14() {
        String str = "приветпривет привет";
        String word = "привет";
        ISearchEngine searchEngine = new EasySearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }

    @Test
    public void search15() {
        String str = "засветло-привет привет";
        String word = "привет";
        ISearchEngine searchEngine = new EasySearch();
        Assertions.assertEquals(1, searchEngine.search(str, word));
    }

}
