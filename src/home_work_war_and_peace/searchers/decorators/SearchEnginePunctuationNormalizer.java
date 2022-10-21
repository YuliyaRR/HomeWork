package home_work_war_and_peace.searchers.decorators;

import home_work_war_and_peace.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public String normalizedText(String text) {
        String regExpOne = "(\\.+|,|:|;|!+|\\?+|\\*+|\"|'|\\?!)$";
        String regExpTwo = "(\\.|,|:|;|!|\\?|\\*|\"|')";
        String regExpThree = "(\\s{2,}|--| -|- )";
        return text.replaceAll(regExpOne,"").replaceAll(regExpTwo, " ").replaceAll(regExpThree, " ");
    }

    @Override
    public long search(String text, String word) {
        String textNormal = normalizedText(text);
        return searchEngine.search(textNormal, word);
    }
}
