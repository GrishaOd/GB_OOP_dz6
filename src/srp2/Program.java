package srp2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = createOrderFromConsole();
        DataSaver.saveToJson(order);
    }

    public static Order createOrderFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.print("Имя клиента: ");
        String clientName = in.nextLine();

        System.out.print("Продукт: ");
        String product = in.nextLine();

        System.out.print("Количество: ");
        int qnt = Integer.parseInt(in.nextLine());

        System.out.print("Цена: ");
        int price = Integer.parseInt(in.nextLine());

        in.close();

        return new Order(clientName, product, qnt, price);
    }

}
