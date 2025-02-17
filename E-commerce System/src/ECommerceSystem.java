import org.w3c.dom.ls.LSOutput;
import java.util.ArrayList;
import java.util.List;

public class ECommerceSystem extends User{
    public List<User> users;
    public List<Order> orders;

    public ECommerceSystem() {
        super();
        this.users = new ArrayList<User>();
        this.orders = new ArrayList<Order>();
    }
    public void registerUser(User user) {
        users.add(user);
        System.out.println("User "+ user.userId + " registered." );
    }
    public void placeOrder(String userId, List<String> items) {
        for (User user : users) {
            if (users.contains(userId)) {
                String orderId = "";
                Order order = new Order(orderId, userId, items);
                orders.add(order);
                System.out.println("Order "+ orderId + " placed successfully by User " + userId );
            }
        }

    }

    public void viewAllUsers() {
        System.out.println("All registered users:");
        for (User user : users) {
            user.printUserDetails();
        }
    }
    public void viewAllOrders() {
        System.out.println("All orders:");
        for (Order order : orders) {
            order.printOrderDetails();
        }
    }
    

}

