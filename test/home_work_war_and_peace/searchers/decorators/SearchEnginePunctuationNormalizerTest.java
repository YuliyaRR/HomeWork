package home_work_war_and_peace.searchers.decorators;

import home_work_war_and_peace.searchers.EasySearch;
import home_work_war_and_peace.searchers.decorators.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEnginePunctuationNormalizerTest {
    @Test
    public void normalizedText() {
        SearchEnginePunctuationNormalizer normalizer = new SearchEnginePunctuationNormalizer(new EasySearch());
        String text = "Hello, were   you,   here!   yesterday?";
        String expected = "Hello were you here yesterday";
        Assertions.assertEquals(expected, normalizer.normalizedText(text));
    }

    @Test
    public void normalizedText2() {
        SearchEnginePunctuationNormalizer normalizer = new SearchEnginePunctuationNormalizer(new EasySearch());
        String text = "Hello were you here yesterday";
        String expected = "Hello were you here yesterday";
        Assertions.assertEquals(expected, normalizer.normalizedText(text));
    }

    @Test
    public void normalizedText3() {
        SearchEnginePunctuationNormalizer normalizer = new SearchEnginePunctuationNormalizer(new EasySearch());
        String text = "Hello-hello were you here yesterday";
        String expected = "Hello-hello were you here yesterday";
        Assertions.assertEquals(expected, normalizer.normalizedText(text));
    }

    @Test
    public void normalizedText4() {
        SearchEnginePunctuationNormalizer normalizer = new SearchEnginePunctuationNormalizer(new EasySearch());
        String text = "Hello--hello were you here yesterday";
        String expected = "Hello hello were you here yesterday";
        Assertions.assertEquals(expected, normalizer.normalizedText(text));
    }

    @Test
    public void normalizedText5() {
        SearchEnginePunctuationNormalizer normalizer = new SearchEnginePunctuationNormalizer(new EasySearch());
        String text = "Hello... hello...";
        String expected = "Hello hello";
        Assertions.assertEquals(expected, normalizer.normalizedText(text));
    }

    @Test
    public void normalizedText6() {
        SearchEnginePunctuationNormalizer normalizer = new SearchEnginePunctuationNormalizer(new EasySearch());
        String text = "Hello- hello";
        String expected = "Hello hello";
        Assertions.assertEquals(expected, normalizer.normalizedText(text));
    }

    @Test
    public void normalizedText7() {
        SearchEnginePunctuationNormalizer normalizer = new SearchEnginePunctuationNormalizer(new EasySearch());
        String text = "Hello -hello";
        String expected = "Hello hello";
        Assertions.assertEquals(expected, normalizer.normalizedText(text));
    }

    @Test
    public void normalizedText8() {
        SearchEnginePunctuationNormalizer normalizer = new SearchEnginePunctuationNormalizer(new EasySearch());
        String text = "Hello hello?!";
        String expected = "Hello hello";
        Assertions.assertEquals(expected, normalizer.normalizedText(text));
    }

    @Test
    public void normalizedText9() {
        SearchEnginePunctuationNormalizer normalizer = new SearchEnginePunctuationNormalizer(new EasySearch());
        String text = "Hello.hello";
        String expected = "Hello hello";
        Assertions.assertEquals(expected, normalizer.normalizedText(text));
    }
}
