package home_work_war_and_peace.searchers.decorators;

import home_work_war_and_peace.api.ISearchEngine;
import home_work_war_and_peace.searchers.RegExSearch;

public class SearchEngineWithCaseIgnore implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SearchEngineWithCaseIgnore(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }
    @Override
    public long search(String text, String word) {
        if (searchEngine instanceof RegExSearch) {
            return ((RegExSearch) searchEngine).searchIgnoreCase(text, word);
        } else {
            return searchEngine.search(text.toLowerCase(), word.toLowerCase());
        }
    }
}
