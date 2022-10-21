package home_work_war_and_peace.workers;

import home_work_war_and_peace.api.ISearchEngine;
import home_work_war_and_peace.dto.ResultSearch;
import home_work_war_and_peace.searchers.EasySearch;
import java.io.File;
import java.util.concurrent.Callable;

public class SearchCallable implements Callable<ResultSearch> {
    private File file;
    private String word;


    public SearchCallable(File file, String word) {
        this.file = file;
        this.word = word;
    }

    @Override
    public ResultSearch call() throws Exception {
        ISearchEngine easySearch = new EasySearch();
        ReaderFromFile readerFromFile = new ReaderFromFile();
        String text = readerFromFile.readBookFile(file);
        long result = easySearch.search(text, word);
        ResultSearch resultSearch = new ResultSearch(file.getName(), word, result);

        return resultSearch;
    }
}
