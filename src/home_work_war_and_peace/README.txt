Война и мир
2. Работа с коллекциями
package runners: Main; 
package workers: Filler, ReaderFromFile, TextSeparator, Sorter; 
package comparator: ComparatorWordCount;
package dto: WordCount

3. Написать интерфейс ISearchEngine
package api: ISearchEngine

4. Реализовать интерфейс ISearchEngine:
package dto: ResultSearch;
package searchers: EasySearch - 4.1 Написать класс EasySearch.
package searchers: RegExSearch - 4.2* Написать класс RegExSearch.
package searchers.decorators: SearchEnginePunctuationNormalizer - 4.3* Написать декоратор SearchEnginePunctuationNormalizer.
package searchers.decorators: SearchEngineWithCaseIgnore - 4.4* Написать декоратор для ISearchEngine который будет позволять искать данные без учёта регистра.

5. Используя реализации интерфейса ISearchEngine вывести информацию как часто встречаются слова "война", "и" (как союз), "мир". 
package runners: Main; 

6. Протестировать работу созданных реализаций интерфейса ISearchEngine
test -> package searchers: EasySearchTest, RegExSearchTest;
test -> package searchers.decorators: SearchEnginePunctuationNormalizerTest, SearchEngineWithCaseIgnoreTest;

+++ тесты других созданных классов:
test -> package comparator:ComparatorWordCountTest;
test -> package workers: FillerTest, ReaderFromFileTest, TextSeparatorTest, SorterTest; 


7.Работа с файлами
package runners: Task7 -> результат записан в файл result.txt;
package workers: Filler, Printer, ReaderFromFile, WriterToFile;
package api: ISearchEngine;
package searchers: EasySearch;
package dto: ResultSearch;

8.Многопоточное программирование
package runners: Task8MultiSearch -> результат записан в файл resultMultiSearch.txt;
package workers: Filler, ReaderFromFile, WriterToFile, SearchCallable;
package api: ISearchEngine;
package searchers: EasySearch;
package dto: ResultSearch.