import java.util.ArrayList;
import java.util.List;

public class Order {
    public String orderId;
    public String userId;
    public List<String> orderDetails ;

    public Order(String orderId, String userId, List<String> orderDetails) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderDetails = new ArrayList<String>();
    }


    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order placed by" + userId);
        System.out.println("Items: ");
        for (String item: orderDetails) {
            System.out.println(item);
        }
    }

}
