package home_work_pizzeria;

import home_work_pizzeria.api.*;
import java.util.Objects;
import java.util.Scanner;

public class StartMain {
    public static void main(String[] args) {

        IPizzaInfo standardMargarita = new StandardPizzaInfo(
                "Маргарита", "Томатный соус, сыр моцарелла",
                355);
        IPizzaInfo standardBQ = new StandardPizzaInfo(
                "Барбекю", "Шампиньоны, лук, курица, бекон, соус барбекю, сыр моцарелла",
                385);
        IPizzaInfo standardCarbonara = new StandardPizzaInfo(
                "Карбонара", "Шампиньоны, лук, крем фреш, бекон, сыр моцарелла, ветчина",
                385);
        IPizzaInfo standard4seasons = new StandardPizzaInfo(
                "4 Сезона", "Томаты, опята, соус ранч, пепперони, креветки, ананас, сыр моцарелла, фета",
                715);
        IPizzaInfo standardProvans = new StandardPizzaInfo(
                "Прованс", "Голубой сыр, томаты, сыр моцарелла, пепперони, ветчина, крем фреш",
                380);

        IMenuRow standardMenuRowMarg = new StandardMenuRow(standardMargarita, 25.0);
        IMenuRow standardMenuRowBQ = new StandardMenuRow(standardBQ, 27.0);
        IMenuRow standardMenuRowCarbonara = new StandardMenuRow(standardCarbonara, 19.0);
        IMenuRow standardMenuRow4seasons = new StandardMenuRow(standard4seasons, 29.0);
        IMenuRow standardMenuRowProvans = new StandardMenuRow(standardProvans, 20.0);

       //формирование стандартного меню
        StandardMenu standardMenu = new StandardMenu();
        standardMenu.addToStandardMenu(standardMenuRowBQ);
        standardMenu.addToStandardMenu(standardMenuRowMarg);
        standardMenu.addToStandardMenu(standardMenuRowCarbonara);
        standardMenu.addToStandardMenu(standardMenuRow4seasons);
        standardMenu.addToStandardMenu(standardMenuRowProvans);

        IPizzeria pizzeria = new Pizzeria(standardMenu);

        System.out.println("Меню пиццерии:");
        System.out.println(pizzeria.takeMenu());

        Scanner scanner = new Scanner(System.in);

        //формирование заказа
        IOrder order = new StandardOrder();
        System.out.println("Выбор из стандартного меню:");
        String choice;
        int choiceCount;
        for (IMenuRow item : standardMenu.getItems()) {
            System.out.println("Хотите добавить в заказ: " + item + "?");
            System.out.println("Да/нет");
            choice = scanner.next();
            if (Objects.equals(choice, "да")){
                System.out.println("Сколько пицц добавить?");
                choiceCount = scanner.nextInt();
                order.getSelected().add(new SelectedItem(item,choiceCount));
            }
        }

        IOrder order2 = order;

        System.out.println("Ваш заказ");
        System.out.println(order);

        System.out.println("Ваш заказ");
        System.out.println(order2);

        //Выдача квитка по заказу
        ITicket ticket = pizzeria.create(order);
        System.out.println("Ваш квиток к заказу");
        System.out.println(ticket);

        ITicket ticket2 = pizzeria.create(order2);
        System.out.println("Ваш квиток к заказу");
        System.out.println(ticket2);

        //Статус заказа по квитку
        IOrderStatus status = new OrderStatus(ticket);
        System.out.println("Статус вашего заказа: " + status);

        IOrderStatus status2 = new OrderStatus(ticket2);
        System.out.println("Статус вашего заказа: " + status2);

        do {
            System.out.println("Заказ " + ticket.getNumber());
            System.out.println("Текущая стадия завершена? Да/нет");
            String result = scanner.next();
            if(Objects.equals(result, "да")) {
               IStage next = new StandardStage(status);
            }
            System.out.println("Проверка статуса заказа\n" + pizzeria.check(status.getTicket()));
        } while (!status.isDone());

        System.out.println("История стадий заказа по квитку " + status.getTicket().getNumber() + ":\n" + status.getHistory());
        System.out.println("История стадий заказа по квитку " + status2.getTicket().getNumber() + ":\n" + status2.getHistory());

        //Проверка готовности заказа и выдача
        checkDone(status);
        System.out.println("Выдача готового заказа (квиток " + ticket.getNumber() + "): " + pizzeria.pickUp(ticket));
        checkDone(status2);
        System.out.println("Выдача готового заказа (квиток " + ticket2.getNumber() + "): " + pizzeria.pickUp(ticket2));


    }

    public static void checkDone(IOrderStatus status) {
        if (status.isDone()) {
            Pizzeria.addDoneOrder(status.getTicket(), new StandardDoneOrder(status.getTicket()));
        }
    }
}
