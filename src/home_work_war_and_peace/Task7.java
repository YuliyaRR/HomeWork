package home_work_war_and_peace;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Map<Integer,String> books = new HashMap<>();
        Map<Integer,File> booksFile = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String pathDirectory = "HomeWork/eBooks";

        File file = new File(pathDirectory);

        if(file.isDirectory()) {
            File[]arr = file.listFiles();
            if (arr != null) {
                for (int i = 0; i < arr.length; i++) {
                    books.put(i+1, arr[i].getName());
                    booksFile.put(i+1, arr[i]);
                }
            }
        }

        System.out.println("Список книг: ");

        printAllBooks(books);

        File fileForResult = new File("HomeWork/result.txt");

        int exit = 1;
        int numberBook = 0;
        while (exit != 0){
            do {
                System.out.println("Введите номер понравившейся книги: ");
                numberBook = scanner.nextInt();
            } while (!booksFile.containsKey(numberBook));

            File fileBook = booksFile.get(numberBook);

            System.out.println("Вы выбрали книгу - " + fileBook.getName());

            String textFromBook = readFromFile(fileBook);

            EasySearch easySearch = new EasySearch();

            int exit2;
            do {
                System.out.println("Введите слово, которое хотите найти и посчитать в тексте: ");
                String word = scanner.next();
                long result = easySearch.search(textFromBook, word);
                ResultSearch resultSearch = new ResultSearch(fileBook.getName(), word, result);

                writeResultToFile(fileForResult, resultSearch);

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

    public static void printAllBooks(Map<Integer,String> books){
        for (Map.Entry<Integer, String> entry : books.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    public static String readFromFile(File fileBook) {
        StringBuilder stb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileBook))) {
            while (reader.ready()) {
                stb.append(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stb.toString();
    }

    public static void writeResultToFile(File result, ResultSearch resultSearch) {
        try (Writer writer = new FileWriter(result, true)) {
            writer.write(resultSearch.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

