package home_work_war_and_peace;

import java.io.File;
import java.util.concurrent.Callable;

public class SearchCallable implements Callable<ResultSearch> {
    private File file;
    private String word;
    private File fileForResult;

    public SearchCallable(File file, String word, File fileForResult) {
        this.file = file;
        this.word = word;
        this.fileForResult = fileForResult;
    }

    @Override
    public ResultSearch call() throws Exception {
        ISearchEngine easySearch = new EasySearch();
        String text = Task7.readFromFile(file);
        long result = easySearch.search(text, word);
        ResultSearch resultSearch = new ResultSearch(file.getName(), word, result);
        Task7.writeResultToFile(fileForResult, resultSearch);

        return resultSearch;
    }
}
