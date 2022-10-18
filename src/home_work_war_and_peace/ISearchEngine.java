package home_work_war_and_peace;

public interface ISearchEngine {

    /**
     * Метод считает сколько раз встречается слово в тексте.
     * @param text - исследуемый текст
     * @param word - искомое слово
     * @return -количестве раз, которое встречается слово в тексте
     */
    long search(String text, String word);

}
