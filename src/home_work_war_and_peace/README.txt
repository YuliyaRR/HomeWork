����� � ���
2. ������ � �����������
package runners: Main; 
package workers: Filler, ReaderFromFile, TextSeparator, Sorter; 
package comparator: ComparatorWordCount;
package dto: WordCount

3. �������� ��������� ISearchEngine
package api: ISearchEngine

4. ����������� ��������� ISearchEngine:
package dto: ResultSearch;
package searchers: EasySearch - 4.1 �������� ����� EasySearch.
package searchers: RegExSearch - 4.2* �������� ����� RegExSearch.
package searchers.decorators: SearchEnginePunctuationNormalizer - 4.3* �������� ��������� SearchEnginePunctuationNormalizer.
package searchers.decorators: SearchEngineWithCaseIgnore - 4.4* �������� ��������� ��� ISearchEngine ������� ����� ��������� ������ ������ ��� ����� ��������.

5. ��������� ���������� ���������� ISearchEngine ������� ���������� ��� ����� ����������� ����� "�����", "�" (��� ����), "���". 
package runners: Main; 

6. �������������� ������ ��������� ���������� ���������� ISearchEngine
test -> package searchers: EasySearchTest, RegExSearchTest;
test -> package searchers.decorators: SearchEnginePunctuationNormalizerTest, SearchEngineWithCaseIgnoreTest;

+++ ����� ������ ��������� �������:
test -> package comparator:ComparatorWordCountTest;
test -> package workers: FillerTest, ReaderFromFileTest, TextSeparatorTest, SorterTest; 


7.������ � �������
package runners: Task7 -> ��������� ������� � ���� result.txt;
package workers: Filler, Printer, ReaderFromFile, WriterToFile;
package api: ISearchEngine;
package searchers: EasySearch;
package dto: ResultSearch;

8.������������� ����������������
package runners: Task8MultiSearch -> ��������� ������� � ���� resultMultiSearch.txt;
package workers: Filler, ReaderFromFile, WriterToFile, SearchCallable;
package api: ISearchEngine;
package searchers: EasySearch;
package dto: ResultSearch.