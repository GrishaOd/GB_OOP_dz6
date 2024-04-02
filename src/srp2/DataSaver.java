package srp2;

import java.io.FileWriter;
import java.io.IOException;

public class DataSaver {

    public static void saveToJson(Order order) {
        String fileName = "order.json";
        String jsonData = OrderDataFormat.formatToJson(order);

        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(jsonData);
            writer.flush();
            System.out.println("Order saved in JSON format.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

