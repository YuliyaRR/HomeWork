package home_work_war_and_peace.searchers.decorators;

import home_work_war_and_peace.api.ISearchEngine;
import home_work_war_and_peace.searchers.EasySearch;
import home_work_war_and_peace.searchers.RegExSearch;
import home_work_war_and_peace.searchers.decorators.SearchEngineWithCaseIgnore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEngineWithCaseIgnoreTest {
    @Test
    public void search() {
        String str = "Осень пришла, и Здравствуй, осень, и осень ушла, и Прощай, осень";
        String word = "осень";
        ISearchEngine searchEngine = new SearchEngineWithCaseIgnore(new EasySearch());
        Assertions.assertEquals(4, searchEngine.search(str, word));
    }

    @Test
    public void search2() {
        String str = "Осень пришла, и Здравствуй, осень, и осень ушла, и Прощай, осень";
        String word = "осень";
        ISearchEngine searchEngine = new SearchEngineWithCaseIgnore(new RegExSearch());
        Assertions.assertEquals(4, searchEngine.search(str, word));
    }

}
