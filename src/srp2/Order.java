package srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

//    private Scanner scanner = new Scanner(System.in);

    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }



//    public Order(){
//    }

//    public void inputFromConsole(){
//        clientName = prompt("Имя клиента: ");
//        product = prompt("Продукт: ");
//        gnt = Integer.parseInt(prompt("Кол-во: "));
//        price = Integer.parseInt(prompt("Цена: "));
//
//    }

//    private String prompt(String message){
//        System.out.println(message);
//        return scanner.nextLine();
//    }

    public Order(String clientName, String product, int qnt, int price){
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

//    public void saveToJson() {
//        String fileName = "order.json";
//        try (FileWriter writer = new FileWriter(fileName, false)){
//            writer.write("{\n");
//            writer.write("\"clientName\":\"" + clientName + "\",\n");
//            writer.write("\"product\":\"" + product + "\",\n");
//            writer.write("\"gnt\":" + qnt + ",\n");
//            writer.write("\"price\":" + price + "\n");
//            writer.write("}\n");
//            writer.flush();
//        } catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
//    }


}
