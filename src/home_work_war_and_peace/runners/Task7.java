package home_work_war_and_peace.runners;

import home_work_war_and_peace.api.ISearchEngine;
import home_work_war_and_peace.dto.ResultSearch;
import home_work_war_and_peace.workers.*;
import home_work_war_and_peace.searchers.EasySearch;
import java.io.*;
import java.util.Map;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pathDirectory = "HomeWork/eBooks";

        File file = new File(pathDirectory);

        Filler filler = new Filler();

        Map<Integer,String> books = filler.fillMapWithBooksName(file);
        Map<Integer,File> booksFile = filler.fillMapWithBooksFile(file);

        Printer printer = new Printer();

        System.out.println("Список книг: ");
        printer.printAllBooks(books);

        File fileForResult = new File("HomeWork/result.txt");

        ReaderFromFile readerFromFile = new ReaderFromFile();
        WriterToFile writerToFile = new WriterToFile();
        ISearchEngine easySearch = new EasySearch();

        int exit = 1;
        int numberBook;
        while (exit != 0){
            do {
                System.out.println("Введите номер понравившейся книги: ");
                numberBook = scanner.nextInt();
            } while (!booksFile.containsKey(numberBook));

            File fileBook = booksFile.get(numberBook);

            System.out.println("Вы выбрали книгу - " + fileBook.getName());

            String textFromBook = readerFromFile.readBookFile(fileBook);

            int exit2;
            do {
                System.out.println("Введите слово, которое хотите найти и посчитать в тексте: ");
                String word = scanner.next();
                long result = easySearch.search(textFromBook, word);
                ResultSearch resultSearch = new ResultSearch(fileBook.getName(), word, result);

                writerToFile.writeResultToFile(fileForResult, resultSearch);

                System.out.printf("Слово %s встречается в тексте %d раз.", word, result);
                System.out.println("Если хотите прекратить поиск в этой книге - введите 0, " +
                        "если хотите продолжить - любое другое число");
                exit2 = scanner.nextInt();
            } while (exit2 != 0);

            System.out.println("Если хотите прекратить поиск введите 0, " +
                        "если хотите продолжить поиск в другой книге - любое другое число");
            exit = scanner.nextInt();
        }

        System.out.println("Поиск окончен, данные записаны в файл");
    }
}

