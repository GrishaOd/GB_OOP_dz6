package srp2;

public class OrderDataFormat {

    public static String formatToJson(Order order) {
        return "{\n" +
                "\"clientName\":\""+ order.getClientName() + "\",\n" +
                "\"product\":\""+order.getProduct()+"\",\n" +
                "\"qnt\":"+order.getQnt()+",\n" +
                "\"price\":"+order.getPrice()+"\n" +
                "}";
    }
}

