package home_work_1;

import java.util.Scanner;

public class Task6p3 implements ICommunicationPrinter {

    public String welcome(String name) {
        switch (name) {
            case "Вася":
                return "Привет \n Я тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }

    }


}

